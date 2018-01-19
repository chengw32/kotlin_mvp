package com.chen.kotlin.kotlin_mvp.user.presenter

import com.chen.kotlin.kotlin_mvp.user.module.User

/**
 * Author chen_gw
 * Date 2018/1/17 11:38
 * DES :
 */

interface DataCallBack {
        fun dataBack(users: List<User>)
}