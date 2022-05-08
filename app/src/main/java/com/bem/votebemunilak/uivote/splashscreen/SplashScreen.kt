package com.bem.votebemunilak.uivote.splashscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bem.votebemunilak.R


@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        Handler(Looper.myLooper()!!).postDelayed({
            lifecycleScope.launchWhenResumed {
                findNavController().navigate(R.id.action_splashScreen_to_viewpagerFragment)
            }
        }, 5000)
        return view
    }


}