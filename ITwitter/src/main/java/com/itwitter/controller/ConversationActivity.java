package com.itwitter.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itwitter.R;

public class ConversationActivity extends BaseActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        initView();
    }

    @Override
    public void initView() {
        button = (Button) findViewById(R.id.buttonDemo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTip("response");
            }
        });
    }
}
