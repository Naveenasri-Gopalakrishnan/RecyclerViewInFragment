package com.example.recyclerviewinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
class MainActivity2 : AppCompatActivity() {
    private final var fragmentList1: ArrayList<Fragment> = ArrayList()
    private final var fragmentTitleList1: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tab_viewpager = findViewById<ViewPager2>(R.id.tab_viewpager)
        var tab_tablayout = findViewById<TabLayout>(R.id.tab_tablayout)
        setupViewPager(tab_viewpager, tab_tablayout)
    }
    private fun setupViewPager(viewpager: ViewPager2, tab_tablayout: TabLayout) {

        fragmentTitleList1.add("Fragment")
        fragmentTitleList1.add("Login")
        fragmentTitleList1.add("Signup")

        val adapter = ViewPagerAdapter(this, fragmentTitleList1)

        viewpager.adapter = adapter

        TabLayoutMediator(tab_tablayout, viewpager) { tabText, position ->
            tabText.text = fragmentTitleList1[position]
        }.attach()
    }
}

 class ViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    var fragmentTitleList1: ArrayList<String>
) :
    FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int {
        return fragmentTitleList1.size
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment()
        } else if (position == 1) {
            LoginFragment()
        } else {
            SignupFragment()
        }

    }
}