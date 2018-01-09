package com.zhuxiangqing.alert.repository.tasks;

import com.zhuxiangqing.alert.dao.TasksDao;
import com.zhuxiangqing.alert.data.TaskEntity;
import com.zhuxiangqing.alert.repository.Callback;

import java.util.List;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */

public class LocalTaskDataSource implements TaskDataSource {
    private static LocalTaskDataSource INSTANCE;
    private TasksDao tasksDao;

    private LocalTaskDataSource(TasksDao tasksDao) {
        this.tasksDao = tasksDao;
    }

    public static LocalTaskDataSource getInstance(TasksDao tasksDao){
        if (INSTANCE==null){
            INSTANCE = new LocalTaskDataSource(tasksDao);
        }
        return INSTANCE;
    }



    @Override
    public void addTask() {

    }

    @Override
    public void getAllTasks(Callback<List<TaskEntity>> callback) {

    }
}
