package com.miguel.loteria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNY = findViewById<EditText>(R.id.txtNY)
        val txtNac = findViewById<EditText>(R.id.txtNac)
        val lblResultado = findViewById<TextView>(R.id.lblResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val ny = txtNY.text.toString()
            val nac = txtNac.text.toString()

            if (ny.isNotEmpty() && nac.isNotEmpty() && ny.length >= 2 && nac.length >= 2) {
                val n1 = ny[0].digitToInt()
                val n2 = ny[1].digitToInt()
                val aleatorio1 = Random.nextInt(0, 9)
                val aleatorio2 = Random.nextInt(0, 9)

                val r1 = (aleatorio1 + n1) % 10
                val r2 = (aleatorio2 + n2) % 10

                lblResultado.text = "Resultado: $r1$r2"
            } else {
                lblResultado.text = "Introduce números válidos"
            }
        }Crear archivo principal de la app
    }
}
