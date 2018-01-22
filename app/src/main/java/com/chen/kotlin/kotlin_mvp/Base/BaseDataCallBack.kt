package com.chen.kotlin.kotlin_mvp.Base

import com.chen.kotlin.kotlin_mvp.detail.module.DetailBean

/**
 * Author chen_gw
 * Date 2018/1/19 11:40
 * DES :
 */

interface BaseDataCallBack<T>{

    fun dataBack(bean : T)

}