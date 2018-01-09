package com.zhuxiangqing.alert.ui;

/**
 * Created by zhuxi on 2018/1/9.
 */

public interface BaseNavigator {
    void finish();

    //使用通配符
    void startActivity(Class<?> tClass);

    void startActivityForResult(Class<?> tClass,int requestCode);
}
