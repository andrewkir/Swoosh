package com.example.andrewforwork.swoosh.Controller

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.andrewforwork.swoosh.Utilities.EXTRA_LEAGUE
import com.example.andrewforwork.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var SelectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    @SuppressLint("ShowToast")
    fun leagueNextClicked(view: View) {
        if(SelectedLeague!="") {
            val SkillActivity = Intent(this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_LEAGUE,SelectedLeague)
            startActivity(SkillActivity)
        } else {
//            toasts
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
    fun OnMenClicked(view: View){
        womenLeague.isChecked=false
        coedLeague.isChecked=false
        SelectedLeague="men"
    }
    fun OnWomenClicked(view: View){
        menLeague.isChecked=false
        coedLeague.isChecked=false
        SelectedLeague="women"
    }

    fun OnCoedClicked(view: View){
        womenLeague.isChecked=false
        menLeague.isChecked=false
        SelectedLeague="co-ed"
    }

}
