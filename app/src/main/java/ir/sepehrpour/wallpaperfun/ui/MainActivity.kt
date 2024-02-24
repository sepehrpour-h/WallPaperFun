package ir.sepehrpour.wallpaperfun.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.sepehrpour.wallpaperfun.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun Slider (){
    val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3
    )

    val viewPager: ViewPager = findViewById(R.id.viewPager)
    val adapter = SliderAdapter(supportFragmentManager, images)
    viewPager.adapter = adapter
}