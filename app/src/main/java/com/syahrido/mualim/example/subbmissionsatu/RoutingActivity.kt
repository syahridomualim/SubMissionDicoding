package com.syahrido.mualim.example.subbmissionsatu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.syahrido.mualim.example.subbmissionsatu.databinding.ActivityRoutingBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RoutingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityRoutingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            startActivity(Intent(this@RoutingActivity, MainActivity::class.java))
            finish()
        }

    }
}