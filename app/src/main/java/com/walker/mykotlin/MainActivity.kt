package com.walker.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import com.walker.mykotlin.practice1.PlayerUI
import com.walker.mykotlin.practice1.PlayerViewType
import com.walker.mykotlin.practice1.User

class MainActivity : AppCompatActivity(), OnClickListener {

    var playerButton:Button?=null

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnPlayer -> onPractice()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playerButton = findViewById(R.id.btnPlayer)
        playerButton!!.setOnClickListener(this)
    }

    private fun onPractice() {
        var user = User(1, "zzs",PlayerViewType.VIP("walker","this is walker's player"))
        PlayerUI.get().showPlayerUI(user,this)
    }
}
