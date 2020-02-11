package com.example.psikodiyetapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button


class QuestionActivity1 : AppCompatActivity() {

    //Animation for button click.
    private val buttonClickAnimation = AlphaAnimation(1f, 0.8f)

    //Second activity, first question, goes to Information Activity, where we get user's height, age and weight.
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question1_activity)
        val answerOne = findViewById<Button>(R.id.answerButtonOne)
        answerOne.setOnClickListener(){
            it.startAnimation(buttonClickAnimation as Animation?)
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("keyIdentifier", 10)
            startActivity(intent)
        }
        val answerTwo = findViewById<Button>(R.id.answerButtonTwo)
        answerTwo.setOnClickListener(){
            it.startAnimation(buttonClickAnimation)
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("keyIdentifier", 10)
            startActivity(intent)
        }
        val answerThree = findViewById<Button>(R.id.answerButtonThree)
        answerThree.setOnClickListener(){
            it.startAnimation(buttonClickAnimation)
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("keyIdentifier", 10)
            startActivity(intent)
        }
        val answerFour = findViewById<Button>(R.id.answerButtonFour)
        answerFour.setOnClickListener(){
            it.startAnimation(buttonClickAnimation)
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("keyIdentifier", 10)
            startActivity(intent)
        }
    }
}
