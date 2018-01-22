package com.chen.kotlin.kotlin_mvp.serverapi

import com.chen.kotlin.kotlin_mvp.detail.module.DetailBean
import com.chen.kotlin.kotlin_mvp.user.module.Users
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Author chen_gw
 * Date 2018/1/16 16:02
 * DES :
 */
const val BASE_URL = "https://api.github.com/"
interface ServerApi{

        @GET("search/users")
        fun getUser(@Query("q")key:String):Flowable<Users>

        @GET
        fun getDetail(@Url key:String):Flowable<DetailBean>

}