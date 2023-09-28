package com.example.hesapmakinesi
import com.example.hesapmakinesi.databinding.ActivityMainBinding
import java.text.DecimalFormat
class Hesaplama(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()
    private val operator= listOf("+","-","*","/",",")
    private val kullanicigirisdizi = mutableListOf<String>()
    private var ekleme=""
    private var islem=""
    private var sayi1=0.0
    private var sayi2=0.0
    fun buttonesittir(): String
    {
        if (giris.isEmpty() || giris.last().toString() in operator)
        {
            return giris
        }
        else
        {
            for (karakter in giris)
            {
                if (karakter.isDigit() || karakter == ',')
                {
                    ekleme += karakter
                }
                else
                {
                    kullanicigirisdizi.add(ekleme)
                    kullanicigirisdizi.add(karakter.toString())
                    ekleme = ""
                }
            }
            kullanicigirisdizi.add(ekleme)
            for (karakter in 1 until kullanicigirisdizi.size step 2)
            {
                sayi1=kullanicigirisdizi[karakter - 1].toDouble()
                if (kullanicigirisdizi[karakter]=="%" )
                {
                    islem="${sayi1/100}"
                    kullanicigirisdizi[karakter]=islem
                    kullanicigirisdizi[karakter - 1]=""
                }
            }
            val temkullanicigirisdizi1 = kullanicigirisdizi.filter { it.isNotEmpty() }.toMutableList()
            for (karakter in 1 until temkullanicigirisdizi1.size step 2)
            {
                sayi1 = temkullanicigirisdizi1[karakter - 1].toDouble()
                sayi2 = temkullanicigirisdizi1[karakter + 1].toDouble()
                if (temkullanicigirisdizi1[karakter] == "*")
                {
                    islem = "${sayi1 * sayi2}"
                    temkullanicigirisdizi1[karakter + 1] = islem
                    temkullanicigirisdizi1[karakter] = ""
                    temkullanicigirisdizi1[karakter - 1] = ""
                }
                else if (temkullanicigirisdizi1[karakter] == "/")
                {
                    islem = "${sayi1 / sayi2}"
                    temkullanicigirisdizi1[karakter + 1] = islem
                    temkullanicigirisdizi1[karakter] = ""
                    temkullanicigirisdizi1[karakter - 1] = ""
                }
            }
            val temkullanicigirisdizi2 = temkullanicigirisdizi1.filter { it.isNotEmpty() }.toMutableList()
            for (karakter in 1 until temkullanicigirisdizi2.size step 2)
            {
                 sayi1 = temkullanicigirisdizi2[karakter - 1].toDouble()
                 sayi2 = temkullanicigirisdizi2[karakter + 1].toDouble()
                if (temkullanicigirisdizi2[karakter] == "+")
                {
                    islem = "${sayi1 + sayi2}"
                    temkullanicigirisdizi2[karakter + 1] = islem
                    temkullanicigirisdizi2[karakter] = ""
                    temkullanicigirisdizi2[karakter - 1] = ""
                }
                else if (temkullanicigirisdizi2[karakter] == "-")
                {
                    islem = "${sayi1 - sayi2}"
                    temkullanicigirisdizi2[karakter + 1] = islem
                    temkullanicigirisdizi2[karakter] = ""
                    temkullanicigirisdizi2[karakter - 1] = ""
                }
            }
            val temkullanicigirisdizi3 = temkullanicigirisdizi2.filter { it.isNotEmpty() }.toMutableList()
            val sonuc = temkullanicigirisdizi3.map { it.toDouble() }.joinToString(" ")
            {
                val duzenle = DecimalFormat("#,###.###")
                duzenle.format(it)
            }
            return sonuc
        }
    }
}