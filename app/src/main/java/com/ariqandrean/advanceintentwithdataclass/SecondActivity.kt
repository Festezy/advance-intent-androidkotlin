package com.ariqandrean.advanceintentwithdataclass

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ariqandrean.advanceintentwithdataclass.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name1 = intent.getStringExtra("EXTRA_NAME1")
        val npm1 = intent.getIntExtra("EXTRA_NPM1", 0)
        val kelas1 = intent.getStringExtra("EXTRA_KELAS1")
        val listname = "Name: $name1\nNPM: $npm1\nKELAS: $kelas1"
        binding.textView2.text = listname

        val bio: BioDataClass = intent.getSerializableExtra("EXTRA_BIO") as BioDataClass
        val name = bio.name
        val npm = bio.npm
        val kelas = bio.kelas
        val format = "Nama: $name\nNPM: $npm\nKelas: $kelas"
        binding.textView4.text = format
    }
}