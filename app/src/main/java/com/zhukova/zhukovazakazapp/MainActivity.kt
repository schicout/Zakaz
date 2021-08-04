package com.zhukova.zhukovazakazapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //val bnvMain = findViewById<ViewPager2>(R.id.bnvMain)

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

        vpMainPager.isUserInputEnabled = false

        val tbMainPanel = findViewById<TabLayout>(R.id.tbMainPanel)
        TabLayoutMediator(tbMainPanel, vpMainPager) { tab, position ->
            tab.text = tabPanelNames[position]
        }.attach()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    //bnvMain.setOnItemSelectedListener ( object : NavigationView.OnItemSelectedListener {
      //  override fun onNavigationItemSelected(item: MenuItem): Boolean {
      //      when(item.itemId){
      //          R.id.selected->{

      //          }
      //      }
      //      return true
     //   }
    //})

}
