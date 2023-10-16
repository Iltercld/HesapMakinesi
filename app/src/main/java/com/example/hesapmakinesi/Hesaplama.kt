package com.example.hesapmakinesi
import androidx.core.text.isDigitsOnly
import com.example.hesapmakinesi.databinding.ActivityMainBinding
class Hesaplama(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()
    private var kullanicigirisdizi = mutableListOf<String>()
    private val operator= listOf("+","-","*","/",".").toString()
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
            kullanicigirisdizi
            if (karakter.isDigit() || karakter.toString()==".")
            {
                ekleme += karakter
            }
            else if (karakter.toString()=="%")
            {
                kullanicigirisdizi.add(ekleme)
                kullanicigirisdizi.add(karakter.toString())
                ekleme=""
            }
            else
            {
                if(ekleme.isNotEmpty()){ kullanicigirisdizi.add(ekleme)}
                kullanicigirisdizi.add(karakter.toString())
                ekleme=""
            }
        }
        if(ekleme.isNotEmpty()){ kullanicigirisdizi.add(ekleme)}
        println(kullanicigirisdizi)
        for (index in 1 until  kullanicigirisdizi.size)
        {
            if(kullanicigirisdizi[index -1].isDigitsOnly()){sayi1 = kullanicigirisdizi[index - 1].toDouble()}
            when (kullanicigirisdizi[index])
            {
                "%" -> {islem = (sayi1/100).toString()
                kullanicigirisdizi[index] = islem
                kullanicigirisdizi[index - 1] = ""}
            }
        }
        println(kullanicigirisdizi)
        val kullanicigirisdizi1 = kullanicigirisdizi.filter { it.isNotEmpty() }.toMutableList()
        println(kullanicigirisdizi1)
        for (index in 1 until kullanicigirisdizi1.size step 2)
        {
            if (kullanicigirisdizi1[index -1].isDigitsOnly()) {
                sayi1 = kullanicigirisdizi1[index - 1].toDouble()
            }
            else if (kullanicigirisdizi1[index +1].isDigitsOnly()) {
                sayi2 = kullanicigirisdizi1[index + 1].toDouble()
            }
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
        println(kullanicigirisdizi1)
        val kullanicigirisdizi2 = kullanicigirisdizi1.filter { it.isNotEmpty() }.toMutableList()
        println(kullanicigirisdizi2)
        for (index in 1 until kullanicigirisdizi2.size step 2)
        {
            if (kullanicigirisdizi2[index -1].isDigitsOnly()) {
                sayi1 = kullanicigirisdizi2[index - 1].toDouble()
            }
            else if (kullanicigirisdizi2[index +1].isDigitsOnly())
            {
                sayi2 = kullanicigirisdizi2[index + 1].toDouble()
            }
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
        println(kullanicigirisdizi2)
        val kullanicigirisdizi3 = kullanicigirisdizi2.filter { it.isNotEmpty() }
        println(kullanicigirisdizi3)
        return kullanicigirisdizi3.toString()
    }
}