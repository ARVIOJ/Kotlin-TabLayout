package com.arvioj.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabs = findViewById<TabLayout>(R.id.tabs)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager)
        val fragmentList = arrayListOf(
            FragmentOne.newInstance(),
            FragmentTwo.newInstance(),
            FragmentThree.newInstance()
        )
        viewPager2.adapter = PagerAdapter(this, fragmentList)
        TabLayoutMediator(tabs, viewPager2) { tab, position ->
            tab.text = "Tab ${(position + 1)}"
        }.attach()
    }
}