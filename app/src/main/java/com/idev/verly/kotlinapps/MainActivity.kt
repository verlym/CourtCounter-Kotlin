package com.idev.verly.kotlinapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

var scoresA: Int = 0
var scoresB: Int = 0

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v) {
            btnPlusOne -> {
                scoresA = scoresA + 1
                teamAScore.setText(scoresA.toString())
            }
            btnPlusTwo -> {
                scoresA = scoresA + 2
                teamAScore.setText(scoresA.toString())
            }
            btnPlusThree -> {
                scoresA = scoresA + 3
                teamAScore.setText(scoresA.toString())
            }
            btnBPlusOne -> {
                scoresB = scoresB + 1
                teamBScore.setText(scoresB.toString())
            }
            btnBPlusTwo -> {
                scoresB = scoresB + 2
                teamBScore.setText(scoresB.toString())
            }
            btnBPlusThree -> {
                scoresB = scoresB + 3
                teamBScore.setText(scoresB.toString())
            }
            btnReset -> {
                scoresA = 0
                scoresB = 0
                teamAScore.setText(scoresA.toString())
                teamBScore.setText(scoresB.toString())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnBPlusOne.setOnClickListener(this)
        btnBPlusTwo.setOnClickListener(this)
        btnBPlusThree.setOnClickListener(this)
        btnPlusThree.setOnClickListener(this)
        btnPlusTwo.setOnClickListener(this)
        btnPlusOne.setOnClickListener(this)
        btnReset.setOnClickListener(this)

    }
}