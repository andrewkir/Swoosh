package com.example.andrewforwork.swoosh.Controller

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.andrewforwork.swoosh.Model.Player
import com.example.andrewforwork.swoosh.R
import com.example.andrewforwork.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    @SuppressLint("ShowToast")
    fun leagueNextClicked(view: View) {
        if(player.league!="") {
            val SkillActivity = Intent(this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(SkillActivity)
        } else {
//            toasts
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
    fun OnMenClicked(view: View){
        womenLeague.isChecked=false
        coedLeague.isChecked=false
        player.league="men"
    }
    fun OnWomenClicked(view: View){
        menLeague.isChecked=false
        coedLeague.isChecked=false
        player.league="women"
    }

    fun OnCoedClicked(view: View){
        womenLeague.isChecked=false
        menLeague.isChecked=false
        player.league="co-ed"
    }

}
