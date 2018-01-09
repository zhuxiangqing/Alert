package com.zhuxiangqing.alert;

import android.content.Context;

import com.zhuxiangqing.alert.dao.AlertDataBase;
import com.zhuxiangqing.alert.repository.tasks.LocalTaskDataSource;
import com.zhuxiangqing.alert.repository.tasks.TasksRepository;

/**
 * Created by zhuxi on 2018/1/9.
 */

public class Injection {
    public static TasksRepository provideTasksRepository(Context context) {
        return new TasksRepository(LocalTaskDataSource.getInstance(AlertDataBase.getInstance(context).provideTasksDao()));
    }
}
