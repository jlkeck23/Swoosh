package com.jenk.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClick(view: View) {
        womensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClick(view: View){
        mensLeagueBtn.isChecked = false
        co_edLeagueBtn.isChecked = false
        selectedLeague ="womens"

    }

    fun onCoedClick(view: View){
        mensLeagueBtn.isChecked= false
        womensLeagueBtn.isChecked=false
        selectedLeague= "co-ed"

    }

    fun leagueNextClicked(view: View){
        if(selectedLeague!= "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }





}
