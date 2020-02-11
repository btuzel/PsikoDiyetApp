package com.example.psikodiyetapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {

    //We get user's info here, age, weight and height, next activity is DietPicture activity, where we show blurred picture of diet plan.
    val listOfWeight = (30..150).toList().toTypedArray()
    val listOfAge = (18..95).toList().toTypedArray()
    val listOfHeight = (120..220).toList().toTypedArray()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity)
        val nameOfUser = findViewById<EditText>(R.id.nameText)
        val weight = findViewById<Spinner>(R.id.weightSpinner)
        if (weight != null) {
            val adapter = ArrayAdapter(this,
                R.layout.spinner_item_layout, listOfWeight)
            weight.adapter = adapter}
        val age = findViewById<Spinner>(R.id.ageSpinner)
        if (age != null) {
            val adapter = ArrayAdapter(this,
                R.layout.spinner_item_layout, listOfAge)
            age.adapter = adapter}
        val height = findViewById<Spinner>(R.id.heightSpinner)
        if (height != null) {
            val adapter = ArrayAdapter(this,
                R.layout.spinner_item_layout,listOfHeight)
            height.adapter = adapter}
        val dietPlan = findViewById<Button>(R.id.seeDietPlanButton)
        dietPlan.setOnClickListener() {
            if (nameOfUser.text.isNullOrEmpty()) {
                Toast.makeText(this, "İsim boş kalamaz.", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, DietPictureActivity::class.java)
                intent.putExtra("keyIdentifier", 10)
                startActivity(intent)
            }
        }
    }
}
