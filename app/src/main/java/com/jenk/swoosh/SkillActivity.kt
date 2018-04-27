package com.jenk.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.jenk.swoosh.Utilities.EXTRA_LEAGUE

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishedClick(view: View){
        val finishActivity= Intent(this, FinishActivity::class.java)
        startActivity(finishActivity)
    }

}
