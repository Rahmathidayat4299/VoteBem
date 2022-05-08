package com.bem.votebemunilak.uivote.landpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bem.votebemunilak.R
import com.bem.votebemunilak.databinding.FragmentViewpagerBinding

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewpagerBinding? = null
    private val binding get() = _binding!!
    private lateinit var fragmentList: List<Fragment>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentViewpagerBinding.inflate(inflater, container, false)
        fragmentList = arrayListOf(
            FirstLanding(),
            SecondFragment()
        )

        val adapter = AdapterViewPager(
            fragmentList as ArrayList<Fragment>,
            childFragmentManager,
            lifecycle
        )

        binding.vpLanding.adapter = adapter

        val wormDotsIndicator = binding.wormDotsIndicator
        wormDotsIndicator.setViewPager2(binding.vpLanding)

        return binding.root
    }

}