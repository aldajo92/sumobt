package com.projects.aldajo92.sumobt.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.projects.aldajo92.sumobt.R

class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(this::openMainScreen, 1000)
    }

    private fun openMainScreen(){
        startActivity(Intent(this, MainActivity::class.java))
    }

}