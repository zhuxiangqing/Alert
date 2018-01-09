package com.zhuxiangqing.alert.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.zhuxiangqing.alert.data.TaskEntity;

/**
 * Created by zhuxi on 2018/1/9.
 *
 */
@Database(entities = {TaskEntity.class},version = 1)
public abstract class AlertDataBase extends RoomDatabase{

    private static AlertDataBase INSTANCE;

    private AlertDataBase() {
    }

    public static AlertDataBase getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AlertDataBase.class,"Tasks.db")
                    .build();
        }
        return INSTANCE;
    }

    public abstract TasksDao provideTasksDao();

}
