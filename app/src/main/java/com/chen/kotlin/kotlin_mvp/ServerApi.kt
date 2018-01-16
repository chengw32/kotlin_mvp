package com.chen.kotlin.kotlin_mvp

import retrofit2.http.GET

/**
 * Author chen_gw
 * Date 2018/1/16 16:02
 * DES :
 */

interface ServerApi{

        @GET("")
        fun getUser(){}
}