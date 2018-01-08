package com.zhuxiangqing.alert.ui.main;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhuxiangqing.alert.data.TaskEntity;
import com.zhuxiangqing.alert.ui.SimpleRVAdapter;

import java.util.List;

/**
 * Created by zhuxi on 2018/1/8.
 */

public class TasksBindings {
    public static void setTasks(RecyclerView recyclerView, List<TaskEntity> entityList) {
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new SimpleRVAdapter<>());
        }
    }
}
