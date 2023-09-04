package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    }
    fun buttonone(view: View) {
        if (binding.textView1.toString().isEmpty()) {
            binding.textView1.text = "1"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "1"
        }
    }

    fun buttontwo(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "2"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "2"
        }
    }

    fun buttonthree(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "3"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "3"
        }
    }

    fun buttonfour(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "4"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "4"
        }
    }

    fun buttonfive(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "5"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "5"
        }
    }

    fun buttonsix(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "6"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "6"
        }
    }

    fun buttonseven(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "7"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "7"
        }
    }

    fun buttoneight(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "8"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "8"
        }
    }

    fun buttonnine(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "9"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "9"
        }
    }

    fun buttonzero(view: View) {
        if (binding.textView1.text.toString().isEmpty()) {
            binding.textView1.text = "0"
        } else {
            binding.textView1.text = "${binding.textView1.text}" + "0"
        }
    }
    fun buttonnokta(view: View)
    {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/' || binding.textView1.text.last() == '.')
        {
            return
        }
        else
        {
            val edittext = '.'
            binding.textView1.text = "${binding.textView1.text}" + "$edittext"
        }
    }

    fun buttonarti(view: View)
    {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/')
        {
            return
        }
        else
        {
            val edittext = '+'
            binding.textView1.text = "${binding.textView1.text}" + "$edittext"
        }
    }

    fun buttoneksi(view: View) {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/'
        ) {
            return
        } else {
            val edittext = '-'
            binding.textView1.text = "${binding.textView1.text}" + "$edittext"
        }
    }

    fun buttoncarpi(view: View) {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/'
        ) {
            return
        } else {
            val edittext = '*'
            binding.textView1.text = "${binding.textView1.text}" + "$edittext"
        }
    }

    fun buttonbolu(view: View) {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/'
        ) {
            return
        } else {
            val edittext = '/'
            binding.textView1.text = "${binding.textView1.text}" + "$edittext"
        }
    }

    fun buttondelete(view: View) {
        val currentText = binding.textView1.text.toString()
        if (currentText.isNotEmpty()) {
            val newText = currentText.substring(0, currentText.length - 1)
            binding.textView1.text = newText
        }
    }

    fun buttonesittir(view: View)
    {
        if (binding.textView1.text.toString().isEmpty() || binding.textView1.text.last() == '+'
            || binding.textView1.text.last() == '-' || binding.textView1.text.last() == '*'
            || binding.textView1.text.last() == '/' || binding.textView1.text.last() == '.')
        {
            return
        }
        else
        {
            val dizi1 = mutableListOf<String>()
            var sonuc1 = ""
            for (char in binding.textView1.text)
            {
                if (char.isDigit() || char =='.')
                {
                    sonuc1 += char
                }
                else
                {
                    dizi1.add(sonuc1)
                    sonuc1 = ""
                    sonuc1 += char
                    dizi1.add(sonuc1)
                    sonuc1 = ""
                }
            }
            dizi1.add(sonuc1)
            for (i in 1 until dizi1.size step 2)
            {
                val sayi1=dizi1[i-1].toDouble()
                val sayi2=dizi1[i+1].toDouble()
                var sonuc1:String
                if(dizi1[i]=="*")
                {
                    sonuc1="${sayi1*sayi2}"
                    dizi1[i+1] = sonuc1
                    dizi1[i]=""
                    dizi1[i-1]=""
                }
                else if (dizi1[i]=="/")
                {
                    sonuc1="${sayi1/sayi2}"
                    dizi1[i+1] = sonuc1
                    dizi1[i]=""
                    dizi1[i-1]=""
                }
            }
            val temdizi=dizi1.filter { it.isNotEmpty() }.toMutableList()
            for (i in 1 until temdizi.size step 2)
            {
                val sayi1=temdizi[i-1].toDouble()
                val sayi2=temdizi[i+1].toDouble()
                var sonuc2:String
                if(temdizi[i]=="+")
                {
                    sonuc2="${sayi1+sayi2}"
                    temdizi[i+1] = sonuc2
                    temdizi[i]=""
                    temdizi[i-1]=""
                }
                else if (temdizi[i]=="-")
                {
                    sonuc2="${sayi1-sayi2}"
                    temdizi[i+1] = sonuc2
                    temdizi[i]=""
                    temdizi[i-1]=""
                }
                else
                {
                    sonuc2 = temdizi[i]
                    temdizi[i + 1] = sonuc2
                    temdizi[i] = ""
                    temdizi[i - 1] = ""
                }
            }
            val temdizi2=temdizi.filter { it.isNotEmpty() }.toMutableList()
            binding.textView2.text="$temdizi2"
        }
    }
}