package com.zhuxiangqing.alert.repository.tasks;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */
public class TasksRepository {

    private final TaskDataSource localDataSource;

    public TasksRepository(TaskDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }


}
