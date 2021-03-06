package com.bem.votebemunilak.uivote.cadangan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.bem.votebemunilak.databinding.ActivitySplashVoteBinding
import com.bem.votebemunilak.uivote.MainActivity


class SplashVote : AppCompatActivity() {
    private lateinit var binding: ActivitySplashVoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashVoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}