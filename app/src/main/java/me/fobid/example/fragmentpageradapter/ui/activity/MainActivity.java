package me.fobid.example.fragmentpageradapter.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import me.fobid.example.fragmentpageradapter.R;
import me.fobid.example.fragmentpageradapter.ui.adapter.MainPagerAdapter;
import me.fobid.example.fragmentpageradapter.ui.fragment.BaseFragment;

public class MainActivity extends AppCompatActivity {

    private MainPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;
    private Button mButton;

    private int mSelectedPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.a_main);

        mViewPager = (ViewPager) findViewById(R.id.a_main_viewpager);
        mButton = (Button) findViewById(R.id.a_main_btn_change_fragment);

        mPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mSelectedPosition = position;

                switch (position) {
                    case 0: {
                        setTitle("Text");
                        break;
                    }
                    case 1: {
                        setTitle("Background");
                        break;
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseFragment fragment = mPagerAdapter.getItem(mSelectedPosition);

                fragment.change();
            }
        });
    }
}
