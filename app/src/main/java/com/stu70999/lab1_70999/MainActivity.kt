package com.stu70999.lab1_70999


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //GLogin()
            blogin()
            //GSignUp()
            //BSignUp()
        }
    }
}
val lightBlack = Color(0xFF222222)
