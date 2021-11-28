package com.callor.readbook.model

data class ReadBookVO(
    var isbn: String,
    var title: String,
    var sdate: String,
    var edate: String,
    var subject: String,
    var content: String,
)
