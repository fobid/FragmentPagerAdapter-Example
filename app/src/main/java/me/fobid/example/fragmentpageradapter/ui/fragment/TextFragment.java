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
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import me.fobid.example.fragmentpageradapter.R;
import util.RandomUtils;

/**
 * author @Fobid
 */
public class TextFragment extends BaseFragment {

    private TextView mTextView;
    private ArrayList<String> mTexts;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTexts = new ArrayList<>();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.f_text, null);

        mTextView = (TextView) view.findViewById(R.id.f_text_textview);

        addText();

        return view;
    }

    private void addText() {
        for (int i = 1; i <= 10; i++) {
            mTexts.add(String.valueOf(i));
        }
    }

    @Override
    public void change() {
        if (mTexts.size() > 0) {
            int randomPosition = RandomUtils.getInt(mTexts.size());

            mTextView.setText(mTexts.get(randomPosition));
        }
    }
}
