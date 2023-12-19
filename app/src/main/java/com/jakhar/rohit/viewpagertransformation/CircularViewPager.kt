package com.jakhar.rohit.viewpagertransformation

import android.os.Bundle
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
import com.jakhar.rohit.viewpagertransformation.databinding.ActivityCircularViewPagerBinding

class CircularViewPager : AppCompatActivity() {
    private lateinit var binding: ActivityCircularViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCircularViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addFragment()
    }

    private fun addFragment() = with(binding) {
        val fragmentLists = listOf(
            TenthFragment(),
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            FourthFragment(),
            FifthFragment(),
            SixthFragment(),
            SeventhFragment(),
            EighthFragment(),
            NinthFragment(),
            TenthFragment(),
            FirstFragment()
        )
        val adapter = MyPagerAdapter(supportFragmentManager, lifecycle, fragmentLists)
        viewPager.adapter = adapter
        viewPager.currentItem = 1
        viewPager.registerOnPageChangeCallback(MyPageListener())
    }

    private inner class MyPageListener : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrolled(
            position: Int, positionOffset: Float, positionOffsetPixels: Int
        ) {}

        override fun onPageSelected(position: Int) {
            if (position == 0) {
                binding.viewPager.postDelayed({
                    binding.viewPager.setCurrentItem(10, false)
                }, 500)
            } else if (position == 11) {
                binding.viewPager.postDelayed(
                    {
                        binding.viewPager.setCurrentItem(1, false)
                    }, 500
                )
            }
        }

        override fun onPageScrollStateChanged(state: Int) {}
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.viewPager.unregisterOnPageChangeCallback(MyPageListener())
    }
}