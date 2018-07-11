package com.walker.mykotlin.practice1

import android.content.Context

class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI {
            return Holder.instance
        }
    }

    private object Holder {
        var instance = PlayerUI()
    }

    fun showPlayerUI(user: User,context:Context) {
        getPlayerView(context,user.playerViewType).show()
    }
}