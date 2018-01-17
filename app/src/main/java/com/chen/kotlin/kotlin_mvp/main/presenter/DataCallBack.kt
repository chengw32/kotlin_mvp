package com.chen.kotlin.kotlin_mvp.main.presenter

import com.chen.kotlin.kotlin_mvp.main.module.User
import com.chen.kotlin.kotlin_mvp.main.module.Users

/**
 * Author chen_gw
 * Date 2018/1/17 11:38
 * DES :
 */

interface DataCallBack {
        fun dataBack(users: List<User>)
}