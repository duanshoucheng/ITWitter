package com.itwitter.controller;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itwitter.R;

/**
 * Created by 段守成 on 15/12/6.
 * 邮箱:dsc428@126.com
 */
public class FragmentMsg extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_msg,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fontawesome-webfont.ttf");
//
//        TextView textView01 = (TextView) view.findViewById(R.id.tv);
//        TextView textView02 = (TextView) view.findViewById(R.id.tv02);
//        textView01.setTypeface(typeface);
//        textView02.setTypeface(typeface);
    }
}
