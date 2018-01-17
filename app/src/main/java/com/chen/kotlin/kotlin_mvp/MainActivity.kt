package com.chen.kotlin.kotlin_mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity
import com.chen.kotlin.kotlin_mvp.main.module.User
import com.chen.kotlin.kotlin_mvp.main.presenter.DataCallBack
import com.chen.kotlin.kotlin_mvp.main.presenter.UserPresenter

class MainActivity : BaseActivity() ,DataCallBack{
    override fun dataBack(users: List<User>) {
        users.forEach { Log.e("--forEach--",""+it) }
    }

    override fun initView() {

    }

    override fun setContentView(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        kt_recycle.adapter
//        bt_search.setOnClickListener { Log.e("t",et_content.text.toString()) }
        var p = UserPresenter(this)
        p.getData()
    }

}
