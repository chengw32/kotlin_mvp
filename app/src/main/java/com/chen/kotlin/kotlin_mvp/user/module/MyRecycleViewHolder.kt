package com.chen.kotlin.kotlin_mvp.user.module

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Author chen_gw
 * Date 2018/1/18 9:36
 * DES :
 */

class MyRecycleViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    val mViews : SparseArray<View> by lazy {
        SparseArray<View> ()
    }

   private  fun <T : View> find(viewId: Int): T {
        var view  = mViews.get(viewId)
        if (null == view) {
           view = itemView.findViewById<View>(viewId)
            mViews.put(viewId, view)
        }
        return view as T
    }

    //TextView
    fun findTV (id : Int) : TextView{
        return find(id)
    }
    //ImageView
    fun findIV (id : Int) : ImageView{
        return find(id)
    }
    //View
    fun findV (id : Int) :View{
        return find(id)
    }


}


