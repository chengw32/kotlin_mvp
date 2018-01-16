package com.chen.kotlin.kotlin_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity
import com.chen.kotlin.kotlin_mvp.main.presenter.UserPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun initView() {

    }

    override fun setContentView(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kt_recycle.adapter
        bt_search.setOnClickListener { Log.e("t",et_content.text.toString()) }
        var p = UserPresenter()
        p.getData()
    }

}
