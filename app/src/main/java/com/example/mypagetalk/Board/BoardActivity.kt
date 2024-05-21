package com.example.mypagetalk.Board

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypagetalk.R

//주석
class BoardActivity : AppCompatActivity() {

    private var selectedRadioButtonId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_board)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ratingbar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //별점표시 기능
        val scoreText: TextView = findViewById(R.id.score_text)
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)

        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { _, rating, _ ->
                scoreText.text = "$rating 점"
            }

        //장르 버튼 리스트
        val radioButtons = listOf(
            findViewById<RadioButton>(R.id.genre1),
            findViewById<RadioButton>(R.id.genre2),
            findViewById<RadioButton>(R.id.genre3),
            findViewById<RadioButton>(R.id.genre4),
            findViewById<RadioButton>(R.id.genre5),
            findViewById<RadioButton>(R.id.genre6),
            findViewById<RadioButton>(R.id.genre7),
            findViewById<RadioButton>(R.id.genre8),
            findViewById<RadioButton>(R.id.genre9),
            findViewById<RadioButton>(R.id.genre10),
            findViewById<RadioButton>(R.id.genre11),
            findViewById<RadioButton>(R.id.genre12),
            findViewById<RadioButton>(R.id.genre13),
            findViewById<RadioButton>(R.id.genre14)
        )

        radioButtons.forEach { setupRadioButton(it, radioButtons) }
    }

    //장르 버튼 선택, 취소 기능
    private fun setupRadioButton(radioButton: RadioButton, radioButtons: List<RadioButton>) {
        radioButton.setOnClickListener {
            if (radioButton.isChecked) {
                if (selectedRadioButtonId == radioButton.id) {
                    radioButton.isChecked = false
                    selectedRadioButtonId = -1
                } else {
                    radioButtons.forEach { it.isChecked = false }
                    radioButton.isChecked = true
                    selectedRadioButtonId = radioButton.id
                }
            } else {
                radioButton.isChecked = true
                selectedRadioButtonId = radioButton.id
            }
        }
    }
}
