package com.example.hesapmakinesi
import com.example.hesapmakinesi.databinding.ActivityMainBinding
class Hesaplama(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()
    private val operator= listOf("+","-","*","/",".").toString()
    private var kullanicigirisdizi = mutableListOf<String>()
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
        for (karakter in giris)
        {
            when
            {
                karakter.isDigit() || karakter == '.' -> ekleme += karakter
                else -> {
                    kullanicigirisdizi.add(ekleme)
                    kullanicigirisdizi.add(karakter.toString())
                    ekleme = ""
                }
            }
        }
        kullanicigirisdizi.add(ekleme)
        for (index in 1 until  kullanicigirisdizi.size step 2)
        {
            sayi1 = kullanicigirisdizi[index - 1].toDouble()
            when (kullanicigirisdizi[index])
            {
                "%" -> {islem = (sayi1/100).toString()
                kullanicigirisdizi[index] = islem
                kullanicigirisdizi[index - 1] = ""}
            }
        }
        val kullanicigirisdizi1 = kullanicigirisdizi.filter { it.isNotEmpty() }.toMutableList()
        for (index in 1 until kullanicigirisdizi1.size step 2)
        {
            sayi1 = kullanicigirisdizi1[index - 1].toDouble()
            sayi2 = kullanicigirisdizi1[index + 1].toDouble()
            when (kullanicigirisdizi1[index])
            {
                "*" -> { islem = (sayi1 * sayi2).toString()
                    kullanicigirisdizi1[index + 1] = islem
                    kullanicigirisdizi1[index] = ""
                    kullanicigirisdizi1[index - 1] = ""}
                "/" -> { islem = (sayi1 / sayi2).toString()
                    kullanicigirisdizi1[index + 1] = islem
                    kullanicigirisdizi1[index] = ""
                    kullanicigirisdizi1[index - 1] = ""}
            }
        }
        val kullanicigirisdizi2 = kullanicigirisdizi1.filter { it.isNotEmpty() }.toMutableList()
        for (index in 1 until kullanicigirisdizi2.size step 2)
        {
            sayi1 = kullanicigirisdizi2[index - 1].toDouble()
            sayi2 = kullanicigirisdizi2[index + 1].toDouble()
            when (kullanicigirisdizi2[index])
            {
                "+" -> { islem = (sayi1 + sayi2).toString()
                    kullanicigirisdizi2[index + 1] = islem
                    kullanicigirisdizi2[index] = ""
                    kullanicigirisdizi2[index - 1] = ""}
                "-" -> { islem = (sayi1 - sayi2).toString()
                    kullanicigirisdizi2[index + 1] = islem
                    kullanicigirisdizi2[index] = ""
                    kullanicigirisdizi2[index - 1] = ""}
            }
        }
        val kullanicigirisdizi3 = kullanicigirisdizi2.filter { it.isNotEmpty() }.toMutableList()
        return kullanicigirisdizi3.toString()
    }
}