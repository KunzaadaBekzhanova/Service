package kg.tutorialapp.service

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(v: View) {
        val i = Intent(this, MediaService::class.java)
        if (v.id == R.id.start) {
            startService(i)
        } else {
            stopService(i)
        }
    }
}