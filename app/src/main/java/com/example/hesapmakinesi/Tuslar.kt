package com.example.hesapmakinesi
import com.example.hesapmakinesi.databinding.ActivityMainBinding
class Tuslar(binding: ActivityMainBinding) {
    private var giris: String = binding.textView1.text.toString()
    private var sonuc: String = binding.textView2.text.toString()
    private val islemoperator = listOf("+", "-", "*", "/", ",", "%")
    fun tuslarsayi(sayi: String): String {
        giris += sayi
        return giris
    }

    fun tuslaroperator(operator: String): String {
        if (giris.isEmpty() || giris.last().toString() in islemoperator) {
            return giris
        } else {
            giris += operator
        }
        return giris
    }

    fun tuslarsil(): String {
        if (giris.isNotEmpty()) {
            giris = giris.substring(0, giris.length - 1)
        }
        return giris
    }
    fun tuslarherseyisil(): String {
        if (giris.isNotEmpty() || sonuc.isNotEmpty()) {
            giris = ""
            sonuc = ""
        } else {
            return giris
        }
        return giris
    }
}
