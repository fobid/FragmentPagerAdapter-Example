/*
 * Copyright Fobid. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.fobid.example.fragmentpageradapter.ui.fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import me.fobid.example.fragmentpageradapter.R;
import util.RandomUtils;

/**
 * author @Fobid
 */
public class BackgroundFragment extends BaseFragment {

    private RelativeLayout mRelativeLayout;
    private ArrayList<Integer> mBackgroundColors;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBackgroundColors = new ArrayList<>();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.f_background, null);

        mRelativeLayout = (RelativeLayout) view.findViewById(R.id.f_background_rl_background);

        addColor();

        return view;
    }

    private void addColor() {
        mBackgroundColors.add(Color.BLACK);
        mBackgroundColors.add(Color.BLUE);
        mBackgroundColors.add(Color.CYAN);
        mBackgroundColors.add(Color.DKGRAY);
        mBackgroundColors.add(Color.GREEN);
        mBackgroundColors.add(Color.LTGRAY);
        mBackgroundColors.add(Color.MAGENTA);
        mBackgroundColors.add(Color.RED);
        mBackgroundColors.add(Color.WHITE);
        mBackgroundColors.add(Color.YELLOW);
    }

    @Override
    public void change() {
        if (mBackgroundColors.size() > 0) {
            int randomPosition = RandomUtils.getInt(mBackgroundColors.size());

            mRelativeLayout.setBackgroundColor(mBackgroundColors.get(randomPosition));
        }
    }
}
