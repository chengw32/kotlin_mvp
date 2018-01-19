package com.chen.kotlin.kotlin_mvp

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity
import com.chen.kotlin.kotlin_mvp.user.UserAdapter
import com.chen.kotlin.kotlin_mvp.user.module.User
import com.chen.kotlin.kotlin_mvp.user.presenter.DataCallBack
import com.chen.kotlin.kotlin_mvp.user.presenter.UserPresenter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() ,DataCallBack{

    val mAdapter : UserAdapter by lazy {
        UserAdapter(this)
    }
    val mPresenter : UserPresenter by lazy {
        UserPresenter(this)
    }

    override fun dataBack(users: List<User>) {
        bt_search.isEnabled = true
        bt_search.text = "搜索用户"
        mAdapter.setDataChanged(users)
    }

    override fun initView() {
        kt_recycle.layoutManager = LinearLayoutManager(this)
        kt_recycle.adapter = mAdapter
        bt_search.setOnClickListener {
            bt_search.isEnabled = false
            bt_search.text = "搜索中..."
            mPresenter.getData(et_content.text.toString()) }
    }

    override fun setContentView(): Int = R.layout.activity_main


}
