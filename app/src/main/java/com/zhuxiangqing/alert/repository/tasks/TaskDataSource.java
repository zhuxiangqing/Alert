package com.zhuxiangqing.alert.repository.tasks;

import com.zhuxiangqing.alert.data.TaskEntity;
import com.zhuxiangqing.alert.repository.Callback;

import java.util.List;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */
public interface TaskDataSource {
    void addTask();

    void getAllTasks(Callback<List<TaskEntity>> callback);

}
