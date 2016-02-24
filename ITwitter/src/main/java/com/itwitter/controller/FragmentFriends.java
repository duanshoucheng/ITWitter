package com.itwitter.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itwitter.R;

import org.w3c.dom.Text;

/**
 * Created by 段守成 on 15/12/6.
 * 邮箱:dsc428@126.com
 */
public class FragmentFriends extends BaseFragment {
    private TextView persionInfo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,null);
        persionInfo = (TextView)view.findViewById(R.id.persionInfo);
        persionInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ConversationActivity.class));
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}
