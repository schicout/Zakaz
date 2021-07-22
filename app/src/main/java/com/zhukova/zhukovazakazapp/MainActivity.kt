package com.zhukova.zhukovazakazapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity(), MainNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openAuthorizationFragment()
    }

    override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, AuthorizationFragment())
            .commit()
    }

    override fun openOrderListFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flRoot, OrderListFragment.newInstance(phoneNumber = phoneNumber))
            .addToBackStack("OrderListFragment")
            .commit()
    }

    override fun openInformationAboutTomYamFragment() {
        InformationAboutTomYamFragment().show(
            supportFragmentManager,
            "InformationAboutTomYamFragment"
        )
    }


}
