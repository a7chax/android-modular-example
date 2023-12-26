package com.archax.user

import android.content.*
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.archax.lib.navigation.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserActivity :AppCompatActivity() {

    @Inject
    lateinit var guestNavigation: IFeatureGuestNavigation
    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, UserActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_activity)
        setOnClickListener()
    }

    fun setOnClickListener(){
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            guestNavigation.goToGuestActivity(this)
        }
    }


}