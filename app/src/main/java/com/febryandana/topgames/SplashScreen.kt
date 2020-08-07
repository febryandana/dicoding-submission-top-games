package com.febryandana.topgames

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val moveMain = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(moveMain)
            finish()
        }, 2000)
    }
}