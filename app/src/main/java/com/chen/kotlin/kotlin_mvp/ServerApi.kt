package com.chen.kotlin.kotlin_mvp

import com.chen.kotlin.kotlin_mvp.main.module.User
import com.chen.kotlin.kotlin_mvp.main.module.Users
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Author chen_gw
 * Date 2018/1/16 16:02
 * DES :
 */

interface ServerApi{

        @GET("search/users")
        fun getUser(@Query("q")key:String):Flowable<Users>
}