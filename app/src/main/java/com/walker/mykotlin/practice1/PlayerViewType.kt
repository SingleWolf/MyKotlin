package com.walker.mykotlin.practice1

import android.content.Context

sealed class PlayerViewType {
    object BLUE : PlayerViewType()
    object GREEN : PlayerViewType()
    class VIP(var title: String?=null, var message: String?=null) : PlayerViewType()
}

fun getPlayerView(context: Context, type: PlayerViewType) = when (type) {
    PlayerViewType.BLUE -> BluePlayerView(context)
    PlayerViewType.GREEN -> GreenPlayerView(context)
    is PlayerViewType.VIP -> VipPlayerView(context, type.title, type.message)
}