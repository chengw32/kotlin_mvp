package com.chen.kotlin.kotlin_mvp.user.module

import com.chen.kotlin.kotlin_mvp.detail.module.DetailBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Author chen_gw
 * Date 2018/1/16 16:02
 * DES :
 */

interface ServerApi{

        @GET("search/users")
        fun getUser(@Query("q")key:String):Flowable<Users>

        @GET
        fun getDetail(@Url key:String):Flowable<DetailBean>

}