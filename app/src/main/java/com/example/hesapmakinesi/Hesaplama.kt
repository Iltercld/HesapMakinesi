package com.example.hesapmakinesi

import com.example.hesapmakinesi.databinding.ActivityMainBinding
import java.text.DecimalFormat

class Hesaplama(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()

    fun buttonesittir(): String {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/' || giris.last() == '.')
        {
            return giris
        }
        else
        {
            val kullanicigirisdizi = mutableListOf<String>()
            var ekleme = ""
            for (karakter in giris)
            {
                if (karakter.isDigit() || karakter == '.')
                {
                    ekleme += karakter
                }
                else
                {
                    kullanicigirisdizi.add(ekleme)
                    ekleme = ""
                    ekleme += karakter
                    kullanicigirisdizi.add(ekleme)
                    ekleme = ""
                }
            }
            kullanicigirisdizi.add(ekleme)
            for (karakter in 1 until kullanicigirisdizi.size step 2) {
                val sayi1 = kullanicigirisdizi[karakter - 1].toDouble()
                val sayi2 = kullanicigirisdizi[karakter + 1].toDouble()
                var islem1:String
                if (kullanicigirisdizi[karakter] == "*") {
                    islem1 = "${sayi1 * sayi2}"
                    kullanicigirisdizi[karakter + 1] = islem1
                    kullanicigirisdizi[karakter] = ""
                    kullanicigirisdizi[karakter - 1] = ""
                }
                else if (kullanicigirisdizi[karakter] == "/")
                {
                    islem1 = "${sayi1 / sayi2}"
                    kullanicigirisdizi[karakter + 1] = islem1
                    kullanicigirisdizi[karakter] = ""
                    kullanicigirisdizi[karakter - 1] = ""
                }
            }

            val temkullanicigirisdizi = kullanicigirisdizi.filter { it.isNotEmpty() }.toMutableList()

            for (karakter in 1 until temkullanicigirisdizi.size step 2)
            {
                val sayi1 = temkullanicigirisdizi[karakter - 1].toDouble()
                val sayi2 = temkullanicigirisdizi[karakter + 1].toDouble()
                var islem2: String
                if (temkullanicigirisdizi[karakter] == "+")
                {
                    islem2 = "${sayi1 + sayi2}"
                    temkullanicigirisdizi[karakter + 1] = islem2
                    temkullanicigirisdizi[karakter] = ""
                    temkullanicigirisdizi[karakter - 1] = ""
                }
                else if (temkullanicigirisdizi[karakter] == "-")
                {
                    islem2 = "${sayi1 - sayi2}"
                    temkullanicigirisdizi[karakter + 1] = islem2
                    temkullanicigirisdizi[karakter] = ""
                    temkullanicigirisdizi[karakter - 1] = ""
                }
                else
                {
                    islem2 = temkullanicigirisdizi[karakter]
                    temkullanicigirisdizi[karakter + 1] = islem2
                    temkullanicigirisdizi[karakter] = ""
                    temkullanicigirisdizi[karakter - 1] = ""
                }
            }

            val temkullanicigirisdizi2 = temkullanicigirisdizi.filter { it.isNotEmpty() }.toMutableList()

            val sonuc = temkullanicigirisdizi2.map { it.toDouble() }.joinToString(" ")
            {
                val duzenle = DecimalFormat("#,###.###")
                duzenle.format(it)
            }
            return sonuc
        }
    }
}