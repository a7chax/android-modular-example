package com.archax.guest

import android.content.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GuestActivity :AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, GuestActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)
    }
}