package com.chen.kotlin.kotlin_mvp

import android.os.Build
import android.util.Log
import com.chen.kotlin.kotlin_mvp.main.module.User
import com.chen.kotlin.kotlin_mvp.main.module.Users
import com.chen.kotlin.kotlin_mvp.main.presenter.DataCallBack
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Author chen_gw
 * Date 2018/1/16 17:58
 * DES : 请求数据管理者
 */
const val BASE_URL = "https://api.github.com/"
object DataManager{


    fun bulidManager()  : Retrofit {
       return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL).build()
    }

    fun getUserInfo (callback : DataCallBack) :Flowable<List<User>> {
       var result =  bulidManager().create(ServerApi::class.java).getUser("kotlin")
               .map { it.items }

        result .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe { callback.dataBack(it) }
        return result
    }

}