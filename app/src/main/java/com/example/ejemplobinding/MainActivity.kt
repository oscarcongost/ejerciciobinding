package com.example.ejemplobinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejemplobinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonsuma.setOnClickListener { calculo("+") }
        binding.botonresta.setOnClickListener { calculo("-") }
        binding.botonmultiplicacion.setOnClickListener { calculo("*") }
        binding.botondivision.setOnClickListener { calculo("/") }
    }

    private fun calculo(operacion: String) {
        val num1 = binding.numero1.text.toString().toInt()
        val num2 = binding.numero2.text.toString().toInt()

        val resultado = when (operacion) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> 0.0
        }

        binding.resultado.text = "Resultado: $resultado"
    }
}
