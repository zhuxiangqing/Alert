package com.zhuxiangqing.alert.repository;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */

public interface Callback<T> {
    void onSuccess(T t);
    void onFailed(String msg);
}
