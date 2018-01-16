package com.chen.kotlin.kotlin_mvp.main.module

/**
 * Author chen_gw
 * Date 2018/1/16 18:07
 * DES :
 */

data class Users(var items:List<User>)

data class User(var name:String,var avatar_url:String,
                var html_url:String,var score:Double,var repos_url:String)