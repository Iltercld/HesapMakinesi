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

        val buttonsil=binding.buttonsil

        val buttonesittir=binding.buttonesittir

        val buttonherseysil=binding.buttonherseysil

        val buttonparantez=binding.buttonparantez

        val numberbuttonlist= listOf(binding.button0,binding.button1,binding.button2,binding.button3,
            binding.button4,binding.button5,binding.button6,binding.button7,binding.button8,binding.button9)

        val operatorbuttonmap= mapOf(binding.buttonarti to "+",binding.buttoneksi to "-",
            binding.buttoncarpi to "*", binding.buttonbolu to "/", binding.buttonnokta to ".",
            binding.buttonyuzde to "%")

        for ((index,numberbutton) in numberbuttonlist.withIndex())
        {
            numberbutton.setOnClickListener {val tuslar=Tuslar(binding)
            binding.textView1.text=tuslar.tuslarsayi(sayi=index.toString())}
        }
        for ((operatorbutton,index ) in operatorbuttonmap)
        {
            operatorbutton.setOnClickListener { val tuslar=Tuslar(binding)
            binding.textView1.text=tuslar.tuslaroperator(operator=index)}
        }
        buttonparantez.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarparantez()
        }
        buttonsil.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarsil()
        }
        buttonherseysil.setOnClickListener{
            val tuslar = Tuslar(binding)
            binding.textView1.text=tuslar.tuslarherseyisil()
            binding.textView2.text=tuslar.tuslarherseyisil()
        }
        buttonesittir.setOnClickListener{
            val hesaplama = Hesaplama(binding)
            binding.textView2.text=hesaplama.buttonesittir()
        }
    }
}