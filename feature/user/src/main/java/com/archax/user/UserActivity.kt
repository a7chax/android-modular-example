package com.archax.user

import android.content.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class UserActivity :AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, UserActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_activity)
    }


}