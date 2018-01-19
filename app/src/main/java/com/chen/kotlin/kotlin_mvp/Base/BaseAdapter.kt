package com.chen.kotlin.kotlin_mvp.Base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.chen.kotlin.kotlin_mvp.user.module.MyRecycleViewHolder
import java.util.*

/**
 * Author 陈国武
 * Date 2018/1/15 15:52
 * DES : 列表适配器
 */

abstract class BaseAdapter (var context :Context) : RecyclerView.Adapter<MyRecycleViewHolder>() {
    val dataList : ArrayList<Any> by lazy {
        arrayListOf<Any>()
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
    abstract fun setItemUiData(holder: MyRecycleViewHolder?, position: Int,data : Any)

    fun setDataChanged(data : List<Any>){
        dataList.clear()
        dataList.addAll(data)
        this.notifyDataSetChanged()
    }

}