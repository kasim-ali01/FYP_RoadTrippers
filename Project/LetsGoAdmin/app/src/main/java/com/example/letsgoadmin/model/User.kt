package com.example.letsgoadmin.model
import android.os.Parcelable
import com.example.letsgoadmin.util.constant.Constants
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(

    var id: String = Constants.NULL_STRING,

    var name: String = Constants.NULL_STRING,

    var phone: String = Constants.NULL_STRING,

    var email: String = Constants.NULL_STRING,

    var password: String = Constants.NULL_STRING,

    var dateCreated: Long = Constants.NULL_LONG,

    var isAdmin: Boolean = false,

    var isDeleted: Boolean = false,

    var token: String = Constants.NULL_STRING

) : Parcelable