package com.chen.kotlin.kotlin_mvp.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.chen.kotlin.kotlin_mvp.R
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Author chen_gw
 * Date 2018/1/16 17:58
 * DES : 请求数据管理者
 */
const val BASE_URL = "https://api.github.com/"
object RetrofitManager{


    fun bulid()  : Retrofit {
       return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL).build()
    }
}

object GlideUtil{
    fun show(context :Context?,path :String?,v :ImageView?){
        Glide.with(context!!).load(path).apply(options)
                .into(v!!)
    }

    var options = RequestOptions().placeholder(R.mipmap.glide_default).useAnimationPool(true)
}