package com.zhuxiangqing.alert.ui.main;

import com.zhuxiangqing.alert.Injection;

/**
 * Created by zhuxi on 2018/1/9.
 */

public class MainModule {
    public static MainViewModel createMainViewModel(MainNavigatior navigatior) {
        return new MainViewModel(navigatior, Injection.provideTasksRepository());
    }
}
