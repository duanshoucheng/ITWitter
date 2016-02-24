package com.itwitter.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

/**
 * Created by 段守成 on 15/12/29.
 * 邮箱:dsc428@126.com
 */
abstract public class BaseActivity extends Activity {

    public abstract void initView();

    public void showTip(String info){
        Toast.makeText(getApplicationContext(),info,Toast.LENGTH_LONG).show();
    }
}
