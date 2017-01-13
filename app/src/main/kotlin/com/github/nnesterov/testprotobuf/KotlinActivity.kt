package com.github.nnesterov.testprotobuf

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val message = MessageOuterClass.Message.newBuilder()
                .setId(248)
                .build()
        Log.d("JavaActivity", "Message Id : " + message.id)
    }
}
