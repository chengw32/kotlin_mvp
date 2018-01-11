package com.chen.kotlin.kotlin_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity

class MainActivity : BaseActivity() {
    override fun initView() {
    }

    override fun setContentView(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
