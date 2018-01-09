package com.zhuxiangqing.alert.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.zhuxiangqing.alert.data.TaskEntity;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by zhuxi on 2018/1/9.
 *
 */
@Dao
public interface TasksDao {
    @Insert
    void saveTask(TaskEntity task);

    @Query("SELECT * FROM tasks")
    Flowable<List<TaskEntity>> getAllTasks();
}
