package com.chen.kotlin.kotlin_mvp.user.module

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * Author chen_gw
 * Date 2018/1/16 18:07
 * DES :
 */

data class Users(var items:List<User>)

data class User(@SerializedName("login")var name:String, var avatar_url:String,
                var html_url:String, var score:Double, var repos_url:String, var url:String): Parcelable {

    companion object {
        @JvmField
        val CREATOR : Parcelable.Creator<User> = object : Parcelable.Creator<User>{
            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls<User>(size)
            }

            override fun createFromParcel(source: Parcel): User {
                val name = source.readString()
                val avatar_url = source.readString()
                val html_url =  source.readString()
                val score = source.readDouble()
                val repos_url= source.readString()
                val url= source.readString()
                return User(name,avatar_url,html_url,score,repos_url,url)
            }

        }
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(avatar_url)
        dest?.writeString(html_url)
        dest?.writeDouble(score)
        dest?.writeString(repos_url)
        dest?.writeString(url)
    }

    override fun describeContents(): Int = 0
}