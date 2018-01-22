package com.chen.kotlin.kotlin_mvp.Base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.util.*

/**
 * Author 陈国武
 * Date 2018/1/15 15:52
 * DES : 列表适配器
 */

abstract class BaseAdapter  <T> (var context :Context) : RecyclerView.Adapter<MyRecycleViewHolder>()  {
    val dataList : ArrayList<T> by lazy {
        arrayListOf<T>()
    }
    override fun getItemCount(): Int = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyRecycleViewHolder {
       var view =  LayoutInflater.from(context).inflate(setItemLayout(),parent,false)
           return MyRecycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecycleViewHolder?, position: Int) {
        setItemUiData(holder,position,dataList[position])
    }

    abstract fun setItemLayout():Int
    abstract fun setItemUiData(holder: MyRecycleViewHolder?, position: Int, data : T)

    fun setDataChanged(data : List<T>){
        dataList.clear()
        dataList.addAll(data)
        this.notifyDataSetChanged()
    }

}