package com.example.youtubeapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val API_KEY="AIzaSyD_2tZJM4UOz-wWID_IKIqRyJtWZ8ekjmw"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reproducirId.setOnClickListener(View.OnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this,API_KEY,"N3XXr5-uih8")
            startActivity(intent)
        })
    }
}