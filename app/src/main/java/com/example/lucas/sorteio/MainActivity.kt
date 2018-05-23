package com.example.lucas.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view : View){

        var texto_sorteio = findViewById<TextView>(R.id.texto_sorteio)

        texto_sorteio.text = getString(R.string.number_select) +" "+ Random().nextInt(11)

    }
}
