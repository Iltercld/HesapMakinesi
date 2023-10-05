package com.example.hesapmakinesi
import com.example.hesapmakinesi.databinding.ActivityMainBinding
class Tuslar(binding: ActivityMainBinding)
{
    private var giris= binding.textView1.text.toString()
    private var sonuc= binding.textView2.text.toString()
    private val islemoperator = listOf("+", "-", "*", "/", ",")
    fun tuslarsayi(sayi: String): String
    {
        if (giris.last().toString() == ")")
        {
            giris += "*$sayi"
        }
        else if(giris.isEmpty())
        {
            giris = sayi
        }
        else
        {
            giris += sayi
        }
        return giris
    }
    fun tuslaroperator(operator: String): String
    {
        if (giris.isEmpty() || giris.last().toString() in islemoperator)
        {
            return giris
        }
        else
        {
            giris += operator
        }
        return giris
    }
    fun tuslarparantez(): String
    {
        val acparantezsayi = giris.count { it == '(' }
        val kaparantezsayi = giris.count { it == ')' }

        when
        {
            giris.isEmpty() -> giris = "("
            !giris.contains("(") && giris.last().isDigit() || giris.last().toString() == ")" -> giris += "*("
            giris.contains("(") && giris.last().isDigit() && kaparantezsayi < acparantezsayi -> giris += ")"
            !giris.last().isDigit() && giris.last().toString() != ")" && giris.last().toString() != "(" -> giris += "("
        }
        /*
        if (giris.isEmpty())
        {
            giris = "("
        }
        else if (!giris.contains("(") && giris.last().isDigit() && giris.last().toString() == ")")
        {
            giris += "*("
        }
        else if (kaparantezsayi < acparantezsayi && giris.contains("(") && giris.last().isDigit())
        {
            giris += ")"
        }
        else if (!giris.last().isDigit() && giris.last().toString() != ")" && giris.last().toString() != "(")
        {
            giris += "("
        }
         */
        return giris
    }
    fun tuslarsil(): String
    {
        if (giris.isNotEmpty())
        {
            giris = giris.substring(0, giris.length - 1)
        }
        return giris
    }
    fun tuslarherseyisil(): String
    {
        if (giris.isNotEmpty() || sonuc.isNotEmpty())
        {
            giris = ""
            sonuc = ""
        }
        return giris
    }
}
