package com.walker.mykotlin.practice1

import android.content.Context
import android.support.v7.app.AlertDialog

interface PlayerAction {
    fun show()
    fun getType()
}

class BluePlayerView(var context: Context?) : PlayerAction {

    override fun show() {
        showPlayerView(this.context!!, "playerView is Blue")
    }

    override fun getType() {

    }
}

class GreenPlayerView(var context: Context?) : PlayerAction {

    override fun show() {
        showPlayerView(this.context!!, "playerView is Green")
    }

    override fun getType() {

    }
}

val TITLE = "播放器"
val MESSAGE = "你的专属播放器"
val CONTEXT = null

class VipPlayerView(var context: Context?, var title: String?, var message: String?) : PlayerAction {

    init {
        context = context ?: CONTEXT
        title = title ?: TITLE
        message = message ?: MESSAGE
    }

    constructor() : this(CONTEXT, TITLE, MESSAGE) {
        println("无构造参数")
    }

    constructor(context: Context?) : this(context, TITLE, MESSAGE) {
        println("context一个构造参数")
    }

    constructor(context: Context?, message: String?) : this(context, TITLE, message) {
        println("context和message构造参数")
    }

    override fun show() {
        if (context == null) return
        showPlayerView(context!!, message!!, title!!)
    }

    override fun getType() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun showPlayerView(context: Context, message: String, title: String = "播放器") {
    var builder = AlertDialog.Builder(context).setTitle(title).setMessage(message)
    builder.create().show()
}