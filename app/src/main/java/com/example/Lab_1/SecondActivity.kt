package com.example.Lab_1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.Lab_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = intent.getParcelableExtra<Cats>(MainActivity.CAT_KEY1)
        val cat2 = intent.getParcelableExtra<Cats>(MainActivity.CAT_KEY2)
        val cat3 = intent.getParcelableExtra<Cats>(MainActivity.CAT_KEY3)

        cat1?.let {
            val text =
                "Ім'я: ${cat1.name}," + "\n" + "Порода: ${cat1.poroda}," + "\n" + "Дата народження: ${cat1.data}," + "\n" + "Опис: ${cat1.opus}"
            binding.textView9.text = text

        }

        cat2?.let {
            val text =
                "Ім'я: ${cat2.name}," + "\n" + "Порода: ${cat2.poroda}," + "\n" + "Дата народження: ${cat2.data}," + "\n" + "Опис: ${cat2.opus}"
            binding.textView9.text = text

        }

        cat3?.let {
            val text =
                "Ім'я: ${cat3.name}," + "\n" + "Порода: ${cat3.poroda}," + "\n" + "Дата народження: ${cat3.data}," + "\n" + "Опис: ${cat3.opus}"
            binding.textView9.text = text

        }


    }
}