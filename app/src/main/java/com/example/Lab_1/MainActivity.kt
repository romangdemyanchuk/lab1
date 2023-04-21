package com.example.Lab_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Lab_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = Cats(
             "Мурка",
            "Абісинська кішка",
              "06.03.2020",
              "Порода кішок, що має особливе забарвлення (зональне), схоже на забарвлення зайців або кроликів. На тілі немає ніякого малюнка. Таке забарвлення забезпечується тим, що кожен волосок має смуги, які чергуються (тікінг) — світлі (жовті або охристі) і темні (чорні або коричневі). " + "\n" +
                   "Відбувається це тому, що при розвитку волосся в ньому впереміш відкладається то темний, то світлий пігмент. У зайців або кроликів на волоску є тільки одне темне кільце, тоді як в абісинських кішок два або три (подвійний або потрійний тікінги). Таке забарвлення також називають агуті."
        )
        val cat2 = Cats(
             "Барсік",
            "Бірманська кішка",
              "04.08.2019",
              "Походження породи пов'язують із храмами й монастирями Бірми, де, як припускають, служителі утримували кішок і вважали їх священними. Можливо, вони були виведені шляхом схрещування сіамських із двоколірними довгошерстими." + "\n" +
                   "Почали розводити бірманських кішок у Франції у 20-х роках XX століття. Уперше порода була визнана в 1925 році. У 1959 році кішки цієї породи потрапили в США."
        )
        val cat3 = Cats(
             "Пушок",
            "Британська кішка",
              "05.09.2021",
              "Британська короткошерста є однією з найдавніших порід, хоча племінні книги, куди заносяться найкращі плідники, ведуться всього близько 100 років." + "\n" +
                   "Офіційно визнана більшістю фелінологічних організацій у 1984 році. Зараз поширена в усьому світі й користується великою популярністю."
        )

        binding.button1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(CAT_KEY1, cat1)
            startActivity(intent1)
        }
        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(CAT_KEY2, cat2)
            startActivity(intent2)
        }
        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(CAT_KEY3, cat3)
            startActivity(intent3)
        }
    }
    companion object {
        val CAT_KEY1 = "cat1"
        val CAT_KEY2 = "cat2"
        val CAT_KEY3 = "cat3"

    }
}



