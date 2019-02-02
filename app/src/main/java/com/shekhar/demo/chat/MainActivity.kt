package com.shekhar.demo.chat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.shekhar.demo.chat_ui_sdk.SampleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launchSdkButton.setOnClickListener {
            startActivity(Intent(this, SampleActivity::class.java))
        }
    }
}
