package com.itwitter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.itwitter.controller.BaseFragment;

/**
 * Created by 段守成 on 15/12/6.
 * 邮箱:dsc428@126.com
 */
public class FragmentMe extends BaseFragment {
    private ImageView userPhotoImg;
    private TextView userNameTxt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        userPhotoImg = (ImageView)view.findViewById(R.id.userPhotoImg);

    }
}
