package com.example.androidmodularizationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.archax.lib.navigation.IFeatureUserNavigation
import com.example.androidmodularizationexample.navigator.FeatureUserNavigationImp

class MainActivity :AppCompatActivity() {

    private lateinit var navigator: IFeatureUserNavigation




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigator = FeatureUserNavigationImp()
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    fun setOnClickListener() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            navigator.goToUserActivity(this)
        }
    }


}