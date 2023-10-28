package com.ilkproje.hesapmakinesi
import androidx.core.text.isDigitsOnly
import com.ilkproje.hesapmakinesi.databinding.ActivityMainBinding
class Hesaplama(private val binding: ActivityMainBinding)
{
    private var islem=""
    private var sayi1=0.0
    private var sayi2=0.0
    fun buttonesittir(): String
    {
        val kullanicigirisliste = Kullanicigirisliste(binding)
        val kullanicigirisdizi = kullanicigirisliste.kullanicigirisliste()
        for (index in 1 until  kullanicigirisdizi.toMutableList().size)
        {
            if(kullanicigirisdizi[index -1].isDigitsOnly()){sayi1 = kullanicigirisdizi[index - 1].toDouble()}
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
        val kullanicigirisdizi3 = kullanicigirisdizi2.filter { it.isNotEmpty() }
        println(kullanicigirisdizi3)
        return kullanicigirisdizi3.toString()
    }
}