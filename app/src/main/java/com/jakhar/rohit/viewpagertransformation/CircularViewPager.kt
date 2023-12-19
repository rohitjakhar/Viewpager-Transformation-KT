package com.jakhar.rohit.viewpagertransformation

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.jakhar.rohit.viewpagertransformation.Fragments.EighthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FifthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FirstFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FourthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.NinthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SecondFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SeventhFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SixthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.TenthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.ThirdFragment

class CircularViewPager : AppCompatActivity() {
    var handler = Handler()
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_view_pager)
        viewPager = findViewById(R.id.viewPager)
        addFragment()
    }

    private fun addFragment() {
        val adapter = MyPagerAdapter(getSupportFragmentManager(), this.lifecycle)
        val f1 = FirstFragment()
        val f2 = FirstFragment()
        val second = SecondFragment()
        val third = ThirdFragment()
        val fourth = FourthFragment()
        val fifth = FifthFragment()
        val sixth = SixthFragment()
        val seventh = SeventhFragment()
        val eight = EighthFragment()
        val ninth = NinthFragment()
        val t1 = TenthFragment()
        val t2 = TenthFragment()
        adapter.addFragments(t2)
        adapter.addFragments(f1)
        adapter.addFragments(second)
        adapter.addFragments(third)
        adapter.addFragments(fourth)
        adapter.addFragments(fifth)
        adapter.addFragments(sixth)
        adapter.addFragments(seventh)
        adapter.addFragments(eight)
        adapter.addFragments(ninth)
        adapter.addFragments(t1)
        adapter.addFragments(f2)
        viewPager.adapter = adapter
        viewPager.currentItem = 1
        viewPager.registerOnPageChangeCallback(MyPageListener())
    }

    private inner class MyPageListener : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
        override fun onPageSelected(position: Int) {
            if (position == 0) {
                handler.postDelayed({ viewPager.setCurrentItem(10, false) }, 500)
            } else if (position == 11) {
                handler.postDelayed({ viewPager.setCurrentItem(1, false) }, 500)
            }
        }

        override fun onPageScrollStateChanged(state: Int) {}
    }

    override fun onDestroy() {
        super.onDestroy()
        viewPager.unregisterOnPageChangeCallback(MyPageListener())
    }
}