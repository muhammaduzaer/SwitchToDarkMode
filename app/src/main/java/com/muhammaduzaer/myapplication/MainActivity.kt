package com.muhammaduzaer.myapplication

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButtonToggleGroup
import com.muhammaduzaer.myapplication.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityBinding: ActivityMainBinding
    private val TAG = "MainActivity"


    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        mainActivityBinding.toggleGroup.addOnButtonCheckedListener { _, selectedButton, isChecked ->
            val theme = when (selectedButton) {
                R.id.buttonDefault -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                R.id.buttonDarkMode -> AppCompatDelegate.MODE_NIGHT_YES
                else -> AppCompatDelegate.MODE_NIGHT_NO

            }

            AppCompatDelegate.setDefaultNightMode(theme)
        }


//        val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
//        val sharedPrefEdit: SharedPreferences.Editor = appSettingPrefs.edit()
//        val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)
//
//        if (isNightModeOn) {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//        } else {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//        }
//
//        mainActivityBinding.buttonSwitchTheme.setOnClickListener{
//
//            if (isNightModeOn) {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//                sharedPrefEdit.putBoolean("NightMode", false)
//                sharedPrefEdit.apply()
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//                sharedPrefEdit.putBoolean("NightMode", true)
//                sharedPrefEdit.apply()
//            }
//        }

    }


}