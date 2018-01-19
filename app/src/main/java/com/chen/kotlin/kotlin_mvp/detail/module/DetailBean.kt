package com.chen.kotlin.kotlin_mvp.detail.module

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * Author chen_gw
 * Date 2018/1/19 14:46
 * DES :
 */

data class DetailBean(@SerializedName("login")var name:String
                      ,var avatar_url :String
                      ,var followers :Long
                      ,var following_url :String
                      ,var created_at :String
                      ,var updated_at :String
                      ,var blog :String
                      ,var gists_url :String
                      ,var html_url :String
                       ) : Parcelable {
    override fun describeContents(): Int =0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(avatar_url)
        dest?.writeString(name)
        dest?.writeLong(followers)
        dest?.writeString(following_url)
        dest?.writeString(created_at)
        dest?.writeString(updated_at)
        dest?.writeString(blog)
        dest?.writeString(gists_url)
        dest?.writeString(html_url)
    }


    companion object CREATOR : Parcelable.Creator<DetailBean> {
        override fun createFromParcel(parcel: Parcel): DetailBean {
            var avatar_url = parcel.readString()
            var name = parcel.readString()
            var followers = parcel.readLong()
            var following_url = parcel.readString()
            var created_at = parcel.readString()
            var updated_at = parcel.readString()
            var blog = parcel.readString()
            var gists_url = parcel.readString()
            var html_url = parcel.readString()
            return DetailBean(name,avatar_url,followers,following_url,created_at,updated_at,blog,gists_url,html_url)
        }

        override fun newArray(size: Int): Array<DetailBean?> {
            return arrayOfNulls(size)
        }
    }

}