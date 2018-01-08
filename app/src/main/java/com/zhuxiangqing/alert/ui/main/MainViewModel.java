package com.zhuxiangqing.alert.ui.main;

import com.zhuxiangqing.alert.repository.tasks.TasksRepository;

import java.lang.ref.WeakReference;

/**
 * Created by zhuxi on 2018/1/8.
 *
 */

public class MainViewModel {
    //对Fragment或Activity 的弱引用
    private final WeakReference<MainNavigatior> navigatiorWeakReference;
    private final TasksRepository tasksRepository;

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






}
