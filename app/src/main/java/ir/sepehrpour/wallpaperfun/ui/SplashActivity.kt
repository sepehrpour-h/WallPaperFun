package ir.sepehrpour.wallpaperfun.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.sepehrpour.wallpaperfun.databinding.ActivitySplashBinding
import java.util.Timer
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var textArray = arrayOf(
            "Set Your Wallpaper",
            "Change Your Wallpaper",
            "Find Your Favorite Picture",
            "Delete Old Picture",
            "Set Your Screen",
            "Delete Old Screen",
            "Unlimited Wonderfully Picture",
            "Easy Choose",
            "Search In Library")


        var i = 1
        for (i in 1..9){
            helpTextGenerator((i * 1000).toLong(), textArray[i-1])
        }

        Timer().schedule(timerTask {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 10000)
    }

    private fun helpTextGenerator(delayTime: Long, helpText: String) {
        Timer().schedule(timerTask {
            runOnUiThread(timerTask {
                binding.helpTxt.text = helpText
            })
        }, delayTime)
    }
}