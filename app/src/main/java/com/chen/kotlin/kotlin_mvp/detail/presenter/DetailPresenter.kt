package com.chen.kotlin.kotlin_mvp.detail.presenter

import com.chen.kotlin.kotlin_mvp.Base.BasePresenter
import com.chen.kotlin.kotlin_mvp.Base.BaseDataCallBack
import com.chen.kotlin.kotlin_mvp.detail.module.DetailBean
import com.chen.kotlin.kotlin_mvp.serverapi.ServerApi
import com.chen.kotlin.kotlin_mvp.utils.RetrofitManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Author chen_gw
 * Date 2018/1/19 11:43
 * DES :
 */

class DetailPresenter(var callBack : BaseDataCallBack<DetailBean>) : BasePresenter{
    override fun getData(vararg t: Any) {
        RetrofitManager.bulid().create(ServerApi::class.java).getDetail(t[0] as String)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { callBack.dataBack(it) }
    }

}