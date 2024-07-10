package com.example.carroeletricoapp.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.carroeletricoapp.ui.CarFragment
import com.example.carroeletricoapp.ui.FavoritosFragment

class TabAdapter (fragmentActivity : FragmentActivity) :FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> CarFragment()
            1 -> FavoritosFragment()
            else -> CarFragment()
        }

    }

    override fun getItemCount(): Int {
        return 2
    }
}