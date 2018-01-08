package com.zhuxiangqing.alert.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuxi on 2018/1/2.
 * Simple dataBinding Adapter
` */

public  class SimpleRVAdapter<T> extends RecyclerView.Adapter<SimpleRVAdapter.BaseRVViewHolder<T>> {
    private List<T> list;
    protected int br;
    protected int layoutId;

    public SimpleRVAdapter(int br, int layoutId) {
        this.br = br;
        this.layoutId = layoutId;
    }

    public void refresh(List<T> list){
        if (null == list){
            return;
        }
        if (null == this.list){
            this.list = new ArrayList<>();
        }else {
            this.list.clear();
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public BaseRVViewHolder<T> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseRVViewHolder<>(LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false),br);
    }


    @Override
    public void onBindViewHolder(BaseRVViewHolder<T> holder, int position) {
        holder.bindData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return null == list ? 0 : list.size();
    }

    public static  class BaseRVViewHolder<T> extends RecyclerView.ViewHolder {

        private ViewDataBinding dataBinding;
        private int br;
        public BaseRVViewHolder(View itemView,int br) {
            super(itemView);
            dataBinding  = DataBindingUtil.bind(itemView);
            this.br = br;
        }

        protected  void bindData(T t){
            dataBinding.setVariable(br,t);
        };
    }

    public interface ItemViewClickListener {
        void onClick(RecyclerView.ViewHolder holder);
    }
}
