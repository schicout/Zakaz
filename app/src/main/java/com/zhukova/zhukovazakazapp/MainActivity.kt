package com.zhukova.zhukovazakazapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vpMainPager = findViewById<ViewPager2>(R.id.vpMainPager)
        vpMainPager.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllDishesFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }

        vpMainPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })


        val tabPanelNames = listOf("Всё", "Фаст-фуд", "Десерты")

        //vpMainPager.isUserInputEnabled = false
        val tbMainPanel = findViewById<TabLayout>(R.id.tbMainPanel)
        TabLayoutMediator(tbMainPanel, vpMainPager) { tab, position ->
            tab.text = tabPanelNames[position]
        }.attach()

    }

}
