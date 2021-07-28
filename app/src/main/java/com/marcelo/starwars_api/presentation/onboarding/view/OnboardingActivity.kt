package com.marcelo.starwars_api.presentation.onboarding.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.starwars_api.R
import com.marcelo.starwars_api.presentation.home.view.FilmsAcitivity
import com.marcelo.starwars_api.presentation.home.view.HomeActivity
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) = Intent(context, OnboardingActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        button_Onboarding.setOnClickListener {
            startHomeScreen()
        }
    }

    private fun startHomeScreen() {
        startActivity(FilmsAcitivity.getStartIntent(this))
        finish()
    }
}