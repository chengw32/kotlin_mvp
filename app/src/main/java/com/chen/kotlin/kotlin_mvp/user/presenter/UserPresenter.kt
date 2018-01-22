package com.chen.kotlin.kotlin_mvp.user.presenter

import com.chen.kotlin.kotlin_mvp.Base.BaseDataCallBack
import com.chen.kotlin.kotlin_mvp.serverapi.ServerApi
import com.chen.kotlin.kotlin_mvp.user.module.User
import com.chen.kotlin.kotlin_mvp.utils.RetrofitManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Author chen_gw
 * Date 2018/1/16 14:43
 * DES :
 */

class UserPresenter(var callback: BaseDataCallBack<List<User>>){

    fun getData (keyword :String)  {
        RetrofitManager.bulid().create(ServerApi::class.java).getUser(keyword)
                .map { it.items }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { callback.dataBack(it) }
    }


}