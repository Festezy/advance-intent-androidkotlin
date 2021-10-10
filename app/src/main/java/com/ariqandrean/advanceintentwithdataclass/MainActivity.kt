package com.ariqandrean.advanceintentwithdataclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ariqandrean.advanceintentwithdataclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applyA.setOnClickListener{
            Toast.makeText(this, "applyA Clicked", Toast.LENGTH_SHORT).show()
            val name = binding.etNama.text.toString()
            val npm = binding.etNpm.text.toString().toInt()
            val kelas = binding.etKelas.text.toString()
            Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME1", name)
                it.putExtra("EXTRA_NPM1", npm)
                it.putExtra("EXTRA_KELAS1", kelas)
                startActivity(it)
            }
        }

        binding.applyB.setOnClickListener {
            Toast.makeText(this, "b clicked", Toast.LENGTH_SHORT).show()
            val name = binding.etNama.text.toString()
            val npm = binding.etNpm.text.toString().toInt()
            val kelas = binding.etKelas.text.toString()
            val bio = BioDataClass(name, npm, kelas)
            Intent(this@MainActivity, SecondActivity::class.java).also { intent
                ->
                intent.putExtra("EXTRA_BIO", bio)
                startActivity(intent)
            }
        }
    }
}