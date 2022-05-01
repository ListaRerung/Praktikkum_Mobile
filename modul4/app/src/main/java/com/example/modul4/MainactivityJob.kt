package com.example.modul4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.modul4.databinding.ActivityMainBinding
import java.util.*

class MainactivityJob : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var locale:Locale
    private var current = "en"
    private var currenlang:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tombolindo:Button = binding.indo
        val tombolenglish:Button = binding.english

        tombolindo.setOnClickListener{
            gantibahasa("id")
        }
        tombolenglish.setOnClickListener{
            gantibahasa("en")
        }

    }
    private fun gantibahasa(bahasa :String){
        locale = Locale(bahasa)
        val res = resources
        val dm = res.displayMetrics
        val config = res.configuration
        config.locale = locale
        res.updateConfiguration(config,dm)
        val baru = Intent(this,MainActivity::class.java)
        baru.putExtra(currenlang,bahasa)
        startActivity(baru)
    }
}