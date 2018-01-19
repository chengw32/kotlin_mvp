package com.chen.kotlin.kotlin_mvp.user

import android.content.Context
import android.content.Intent
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.request.RequestOptions
import com.chen.kotlin.kotlin_mvp.Base.BaseAdapter
import com.chen.kotlin.kotlin_mvp.R
import com.chen.kotlin.kotlin_mvp.detail.DetailActivity
import com.chen.kotlin.kotlin_mvp.user.module.MyRecycleViewHolder
import com.chen.kotlin.kotlin_mvp.user.module.User
import com.chen.kotlin.kotlin_mvp.utils.GlideUtil
import com.chen.kotlin.kotlin_mvp.utils.GlideUtil.options

/**
 * Author chen_gw
 * Date 2018/1/18 10:09
 * DES :
 */

class UserAdapter(context: Context) : BaseAdapter(context) {
    override fun setItemUiData(holder: MyRecycleViewHolder?, position: Int, data: Any) {
        var data : User = data as User
        holder?.findTV(R.id.tv_name)?.text = data.name
        GlideUtil.show(context,data.avatar_url,holder?.findIV(R.id.iv_head))
        var intent = Intent(context,DetailActivity::class.java)
        intent.putExtra("path",data.url)
        holder?.findV(R.id.item_view)?.setOnClickListener { context.startActivity(intent) }
    }

    override fun setItemLayout(): Int = R.layout.user_itme



}