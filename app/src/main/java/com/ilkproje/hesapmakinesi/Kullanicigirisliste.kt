package com.ilkproje.hesapmakinesi
import com.ilkproje.hesapmakinesi.databinding.ActivityMainBinding
class Kullanicigirisliste(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()
    private var kullanicigirisdizi= mutableListOf<String>()
    private val operator= listOf("+","-","*","/",".").toString()
    private var ekleme=""
    fun kullanicigirisliste() :MutableList<String>
    {
        if (giris.isEmpty() || giris.last().toString() in operator)
        {
            return kullanicigirisdizi
        }
        for (karakter in giris)
        {
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
        if(ekleme.isNotEmpty())
        {
            kullanicigirisdizi.add(ekleme)
        }
        println(kullanicigirisdizi)
        return kullanicigirisdizi
    }
}