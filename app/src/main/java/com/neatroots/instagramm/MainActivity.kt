package com.neatroots.instagramm

import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = "COLOR.TRANSPARENT"
        Handler(looper .getmainlooper()).postdelayered({
            startActivity(intent(package.context: this, signupactivity::class.java))
            finish()
        }, delay(3000)
    }
}