package com.jenk.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jenk.swoosh.Utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for a $league $skill league near you"
    }
}
