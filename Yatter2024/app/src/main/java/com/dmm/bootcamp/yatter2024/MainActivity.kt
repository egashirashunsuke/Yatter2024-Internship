package com.dmm.bootcamp.yatter2024

import LoginPage
import MainApp
import PostPage
import PublicTimelinePage
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.dmm.bootcamp.yatter2024.ui.theme.Yatter2024Theme

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

      installSplashScreen()

    setContent {
      Yatter2024Theme {
        Surface {
//          PublicTimelinePage()
//          LoginPage()
            MainApp()
        }
      }
    }
  }
}
