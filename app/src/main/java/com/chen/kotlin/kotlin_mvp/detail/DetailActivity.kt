package com.chen.kotlin.kotlin_mvp.detail

import android.util.Log
import com.chen.kotlin.kotlin_mvp.Base.BaseActivity
import com.chen.kotlin.kotlin_mvp.R
import com.chen.kotlin.kotlin_mvp.detail.module.BaseDataCallBack
import com.chen.kotlin.kotlin_mvp.detail.module.DetailBean
import com.chen.kotlin.kotlin_mvp.detail.presenter.DetailPresenter
import com.chen.kotlin.kotlin_mvp.utils.GlideUtil
import kotlinx.android.synthetic.main.activity_detail.*

/**
 * Author chen_gw
 * Date 2018/1/19 11:16
 * DES :
 */
class DetailActivity : BaseActivity(),BaseDataCallBack{
    override fun initView() {
       var detailPath = intent.getStringExtra("path")
        var presenter = DetailPresenter(this)
        presenter.getDetail(detailPath)

    }

    override fun dataBack(bean: DetailBean) {
        GlideUtil.show(this,bean.avatar_url,iv_head)
        tv_name.text = "用户名："+bean.name
        tv_followers.text = "粉丝："+bean.followers
        tv_created_at.text = "创建时间："+bean.created_at
        tv_updated_at.text = "最近跟新时间："+bean.updated_at
        tv_blog.text = "博客地址："+bean.blog
        tv_gists_url.text = "git地址："+bean.gists_url
        tv_html_url.text = "个人主页地址："+bean.html_url
    }

    override fun setContentView(): Int = R.layout.activity_detail

}