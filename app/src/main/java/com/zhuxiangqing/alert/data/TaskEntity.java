package com.zhuxiangqing.alert.data;

import android.arch.persistence.room.Entity;

import org.jetbrains.annotations.NotNull;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */
@Entity(tableName = "tasks")
public final class TaskEntity {
    @NotNull
    private String title;
    private String content;
    private long date;
    private boolean ifAlert;

    public TaskEntity(@NotNull String title, long date) {
       this(title,null,date,false);
    }


    public TaskEntity(@NotNull String title, String content, long date, boolean ifAlert) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.ifAlert = ifAlert;
    }
}
