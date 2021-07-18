package com.zhukova.zhukovazakazapp

import android.app.PendingIntent.getActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MainNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthorizationFragment()
        }

    override fun openKorzinaZakazaFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flRoot, KorzinaZakazaFragment.newInstance(phoneNumber = phoneNumber))
            .addToBackStack("KorzinaZakazaFragment")
            .commit()
    }

     override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, authorizationFragment())
            .addToBackStack("authorizationFragment")
            .commit()
        }
    }
