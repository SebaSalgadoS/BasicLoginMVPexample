package com.sebasalgado.basicloginmvpexample.interactor.data.database


const val SQL_CREATE_ENTRIES =
    "CREATE TABLE ${FeedUserContract.TABLE_NAME} (" +
            "${FeedUserContract.COLUMN_NAME_EMAIL} TEXT PRIMARY KEY," +
            "${FeedUserContract.COLUMN_NAME_USERNAME} TEXT," +
            "${FeedUserContract.COLUMN_NAME_PASSWORD} TEXT)"

const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${FeedUserContract.TABLE_NAME}"