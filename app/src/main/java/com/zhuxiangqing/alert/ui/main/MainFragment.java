package com.zhuxiangqing.alert.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuxiangqing.alert.databinding.FragmentMainBinding;

/**
 * Created by zhuxi on 2018/1/8.
 */

public class MainFragment extends Fragment {
    public static MainFragment create() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMainBinding binding = FragmentMainBinding.inflate(inflater, container, false);
//        binding.setViewModel();
        return binding.getRoot();
    }
}
