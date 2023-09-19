package com.example.hesapmakinesi

import com.example.hesapmakinesi.databinding.ActivityMainBinding

class Tuslar(binding: ActivityMainBinding)
{
    private var giris:String=binding.textView1.text.toString()
    private var edittext=""
    fun tuslar1(): String
    {
        if (giris.isEmpty())
        {
            giris = "1"
        } else
        {
            giris += "1"
        }
        return giris
    }
    fun tuslar2(): String
    {
        if (giris.isEmpty())
        {
            giris = "2"
        } else
        {
            giris += "2"
        }
        return giris
    }
    fun tuslar3(): String
    {
        if (giris.isEmpty())
        {
            giris = "3"
        } else
        {
            giris += "3"
        }
        return giris
    }
    fun tuslar4(): String
    {
        if (giris.isEmpty())
        {
            giris = "4"
        } else
        {
            giris += "4"
        }
        return giris
    }
    fun tuslar5(): String
    {
        if (giris.isEmpty())
        {
            giris = "5"
        } else
        {
            giris += "5"
        }
        return giris
    }
    fun tuslar6(): String
    {
        if (giris.isEmpty())
        {
            giris = "6"
        } else
        {
            giris += "6"
        }
        return giris
    }
    fun tuslar7(): String
    {
        if (giris.isEmpty())
        {
            giris = "7"
        } else
        {
            giris += "7"
        }
        return giris
    }
    fun tuslar8(): String
    {
        if (giris.isEmpty())
        {
            giris = "8"
        } else
        {
            giris += "8"
        }
        return giris
    }
    fun tuslar9(): String
    {
        if (giris.isEmpty())
        {
            giris = "9"
        } else
        {
            giris += "9"
        }
        return giris
    }
    fun tuslar0(): String
    {
        if (giris.isEmpty())
        {
            giris = "0"
        } else
        {
            giris += "0"
        }
        return giris
    }
    fun tuslararti(): String
    {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/')
        {
            return giris
        }
        else
        {
            edittext = "+"
            giris += edittext
        }
        return giris
    }
    fun tuslareksi(): String
    {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/'
        ) {
            return giris
        } else {
            edittext = "-"
            giris += edittext
        }
        return giris
    }
    fun tuslarcarpi(): String
    {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/'
        ) {
            return giris
        } else {
            edittext = "*"
            giris += edittext
        }
        return giris
    }
    fun tuslarbolu(): String
    {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/'
        ) {
            return giris
        } else {
            edittext = "/"
            giris += edittext
        }
        return giris
    }
    fun tuslarnokta(): String
    {
        if (giris.isEmpty() || giris.last() == '+' || giris.last() == '-' || giris.last() == '*'
            || giris.last() == '/' || giris.last() == '.')
        {
            return giris
        }
        else
        {
            edittext = "."
            giris +=edittext
        }
        return giris
    }
    fun tuslarsil(): String
    {
        val duzenlenenmetin = giris
        if (duzenlenenmetin.isNotEmpty())
        {
            val yenimetin = duzenlenenmetin.substring(0, duzenlenenmetin.length - 1)
            giris = yenimetin
        }
        return giris
    }
}