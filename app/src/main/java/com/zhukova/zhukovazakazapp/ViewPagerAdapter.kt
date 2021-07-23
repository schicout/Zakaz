package com.zhukova.zhukovazakazapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (activity: AppCompatActivity) : FragmentStateAdapter (activity){
    private val fragments : MutableList<Fragment> = mutableListOf()

    fun addFragment (fragment: Fragment){
        fragments.add(fragment)
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}