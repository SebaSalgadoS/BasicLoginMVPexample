package com.sebasalgado.basicloginmvpexample.interactor.data.database

import android.provider.BaseColumns

object FeedUserContract : BaseColumns {

    const val TABLE_NAME = "users"
    const val COLUMN_NAME_USERNAME = "username"
    const val COLUMN_NAME_EMAIL = "email"
    const val COLUMN_NAME_PASSWORD = "password"

}