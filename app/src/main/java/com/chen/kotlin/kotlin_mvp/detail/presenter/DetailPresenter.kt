package com.chen.kotlin.kotlin_mvp.detail.presenter

import com.chen.kotlin.kotlin_mvp.detail.module.BaseDataCallBack
import com.chen.kotlin.kotlin_mvp.user.module.ServerApi
import com.chen.kotlin.kotlin_mvp.utils.RetrofitManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Author chen_gw
 * Date 2018/1/19 11:43
 * DES :
 */

class DetailPresenter(var callBack : BaseDataCallBack){
    fun  getDetail( path : String){
        RetrofitManager.bulid().create(ServerApi::class.java).getDetail(path)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { callBack.dataBack(it) }
    }
}