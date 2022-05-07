package com.bem.votebemunilak.uivote.landpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bem.votebemunilak.R

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        val viewpager2 = findViewById<ViewPager2>(R.id.view_pager_2)
//        viewpager2.adapter = ViewPagerAdapter(this.supportFragmentManager, lifecycle)
//        val indicator : CircleIndicator3 = findViewById(R.id.indicator)
//        indicator.setViewPager(viewpager2)
    }
}