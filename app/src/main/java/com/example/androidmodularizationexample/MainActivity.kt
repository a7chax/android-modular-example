package com.example.androidmodularizationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.archax.lib.navigation.IFeatureUserNavigation
import com.example.androidmodularizationexample.navigator.FeatureUserNavigationImp
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity :AppCompatActivity() {

    @Inject
    lateinit var userNavigator: IFeatureUserNavigation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    fun setOnClickListener() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            userNavigator.goToUserActivity(this)
        }
    }


}