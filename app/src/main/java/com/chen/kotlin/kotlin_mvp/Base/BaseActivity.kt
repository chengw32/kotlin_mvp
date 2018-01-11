package com.chen.kotlin.kotlin_mvp.Base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Author 陈国武
 * Date 2018/1/11 9:41
 * DES :
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setContentView())
        initView()
    }

    abstract fun initView()
    abstract fun setContentView():Int

}