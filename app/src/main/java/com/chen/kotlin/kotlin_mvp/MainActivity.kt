package com.chen.kotlin.kotlin_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun initView() {

    }

    override fun setContentView(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kt_recycle.adapter
    }
    
}
