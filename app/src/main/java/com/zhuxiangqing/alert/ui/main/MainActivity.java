package com.zhuxiangqing.alert.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zhuxiangqing.alert.R;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            MainFragment mainFragment = MainFragment.create();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, mainFragment, MainFragment.class.toString())
                    .commit();
        }
    }
}
