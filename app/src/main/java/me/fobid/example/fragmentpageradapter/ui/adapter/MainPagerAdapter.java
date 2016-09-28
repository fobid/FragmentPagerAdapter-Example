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
package me.fobid.example.fragmentpageradapter.ui.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import me.fobid.example.fragmentpageradapter.ui.fragment.BackgroundFragment;
import me.fobid.example.fragmentpageradapter.ui.fragment.BaseFragment;
import me.fobid.example.fragmentpageradapter.ui.fragment.TextFragment;

/**
 * author @Fobid
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    private final SparseArray<BaseFragment> mFragments;


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);

        mFragments = new SparseArray<>();

        mFragments.put(0, new TextFragment());
        mFragments.put(1, new BackgroundFragment());
    }

    @Override
    public BaseFragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
