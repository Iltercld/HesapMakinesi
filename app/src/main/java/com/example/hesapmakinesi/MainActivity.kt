package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val buttonone=binding.button1
        val buttontwo=binding.button2
        val buttonthree=binding.button3
        val buttonfour=binding.button4
        val buttonfive=binding.button5
        val buttonsix=binding.button6
        val buttonseven=binding.button7
        val buttoneight=binding.button8
        val buttonnine=binding.button9
        val buttonzero=binding.button0
        val buttonarti=binding.buttonarti
        val buttoneksi=binding.buttoneksi
        val buttoncarpi=binding.buttoncarpi
        val buttonbolu=binding.buttonbolu
        val buttonnokta=binding.buttonnokta
        val buttonsil=binding.buttonsil
        val buttonesittir=binding.buttonesittir
        buttonone.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar1()
        }
        buttontwo.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar2()
        }
        buttonthree.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar3()
        }
        buttonfour.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar4()
        }
        buttonfive.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar5()
        }
        buttonsix.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar6()
        }
        buttonseven.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar7()
        }
        buttoneight.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar8()
        }
        buttonnine.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar9()
        }
        buttonzero.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslar0()
        }
        buttonarti.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslararti()
        }
        buttoneksi.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslareksi()
        }
        buttoncarpi.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarcarpi()
        }
        buttonbolu.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarbolu()
        }
        buttonnokta.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarnokta()
        }
        buttonsil.setOnClickListener {
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarsil()
        }
        buttonesittir.setOnClickListener {
            val hesaplama = Hesaplama(binding)
            binding.textView2.text=hesaplama.buttonesittir()
        }
    }
}