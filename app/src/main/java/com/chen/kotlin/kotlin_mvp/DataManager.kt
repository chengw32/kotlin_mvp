package com.chen.kotlin.kotlin_mvp

import android.os.Build
import com.chen.kotlin.kotlin_mvp.main.module.Users
import retrofit2.Platform
import retrofit2.Retrofit

/**
 * Author chen_gw
 * Date 2018/1/16 17:58
 * DES :
 */
const val BASE_URL = "https://api.github.com/"
class DataManager{


    fun bulidManager()  : Retrofit {
       return Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL).build()
    }

    fun getUserInfo ()   {
        bulidManager().create(ServerApi::class.java).getUser()
    }

}