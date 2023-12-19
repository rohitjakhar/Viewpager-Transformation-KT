package com.jakhar.rohit.viewpagertransformation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(
    fm: FragmentManager,
    lf: Lifecycle,
    private val fragmentList: List<Fragment>
) : FragmentStateAdapter(fm, lf) {

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}