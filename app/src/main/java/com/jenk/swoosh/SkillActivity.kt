package com.jenk.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jenk.swoosh.Model.Player
import com.jenk.swoosh.Utilities.*
import com.jenk.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_skill.*


class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked = false;
        player.skill = "baller"
    }

    fun onBiginnerClick(view: View){
        ballerSkillBtn.isChecked = false;
        player.skill = "beginner"
    }


    fun onSkillFinishedClick(view: View){
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}
