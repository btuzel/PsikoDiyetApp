package com.example.psikodiyetapp

import android.content.Intent
import android.graphics.BlurMaskFilter
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.diet_picture_activity.*
import android.text.Spanned
import android.text.style.MaskFilterSpan
import android.text.SpannableString
import kotlin.random.Random
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Build


class DietPictureActivity : AppCompatActivity() {

    //We show blurred diet picture here, next activity is where we display our information for contact and other stuff.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diet_picture_activity)
        val dietplans = resources.getStringArray(R.array.dietplans)
        val string = SpannableString(dietplans[(dietplans.indices).random()])
        string.setSpan(MaskFilterSpan(BlurMaskFilter(9f, BlurMaskFilter.Blur.NORMAL)), 47, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) //api 27 didnt work, manifest hardwareacceleration disable fix.
        textView.text = string
        val seeDietPlanButton = findViewById<Button>(R.id.seeDietPlanButton)
        seeDietPlanButton.setOnClickListener {
            val intent = Intent(this,InfoContactActivity::class.java)
            startActivity(intent)
        }
    }
}
