package com.bem.votebemunilak.uivote.landpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterViewPager(
    list:ArrayList<Fragment>,
    fM: FragmentManager,
    lifecycle: Lifecycle
):FragmentStateAdapter(fM,lifecycle)
{
    private val fragmentList:ArrayList<Fragment> = list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}