package com.chen.kotlin.kotlin_mvp.main.presenter

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import com.chen.kotlin.kotlin_mvp.DataManager
import com.chen.kotlin.kotlin_mvp.main.module.User
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Author chen_gw
 * Date 2018/1/16 14:43
 * DES :
 */

class UserPresenter(callback: DataCallBack) : Presenter{

    lateinit var callBack : DataCallBack
    init {
        callBack = callback
    }
    override fun getData() {
       var userList  = DataManager.getUserInfo(callBack)

    }

}