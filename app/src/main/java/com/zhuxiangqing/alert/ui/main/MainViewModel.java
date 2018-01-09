package com.zhuxiangqing.alert.ui.main;

import android.databinding.ObservableArrayList;

import com.zhuxiangqing.alert.data.TaskEntity;
import com.zhuxiangqing.alert.repository.Callback;
import com.zhuxiangqing.alert.repository.tasks.TasksRepository;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */

public class MainViewModel {
    //对Fragment或Activity 的弱引用
    private final WeakReference<MainNavigatior> navigatiorWeakReference;
    public ObservableArrayList<TaskEntity> taskEntities = new ObservableArrayList<>();
    private final TasksRepository tasksRepository;
    private int page=1;

    public MainViewModel(MainNavigatior navigatior, TasksRepository repository) {
        this.tasksRepository = repository;
        this.navigatiorWeakReference = new WeakReference<MainNavigatior>(navigatior);
    }

    /*
    添加新任务按钮的点击事件
     */
    public void addTask() {
        navigatiorWeakReference.get().toAddNewTask();
    }

    /*
    单项Task的点击事件
     */
    public void toTaskDetial(int id){

    }


    public void refresh(){
        page=1;
        tasksRepository.getAllTasks(new Callback<List<TaskEntity>>() {
            @Override
            public void onSuccess(List<TaskEntity> entityList) {

            }

            @Override
            public void onFailed(String msg) {

            }
        });
    }


    public void loadMore(){

    }




}
