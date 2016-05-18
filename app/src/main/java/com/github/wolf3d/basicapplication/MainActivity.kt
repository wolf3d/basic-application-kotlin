package com.github.wolf3d.basicapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.javaClass

class MainActivity : AppCompatActivity() {

    companion object {
        public val EXTRA_MESSAGE: String = "com.github.wolf3d.basicapplication.Message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        Log.d("MainActivity","button_send pressed")

        val intent = Intent(MainActivity@this, DisplayMessageActivity::class.java)
        val editText = edit_message

        val message = editText.text
        intent.putExtra(EXTRA_MESSAGE,message)

        startActivity(intent)

    }
}
