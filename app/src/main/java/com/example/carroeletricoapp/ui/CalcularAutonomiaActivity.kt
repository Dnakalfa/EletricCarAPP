package com.example.carroeletricoapp.ui


import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.carroeletricoapp.R


class CalcularAutonomiaActivity : AppCompatActivity() {

    lateinit var btnClose: ImageView
    lateinit var preco : EditText
    lateinit var kmPercorrido : EditText
    lateinit var resultado : TextView
    lateinit var btnCalcular : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupViews()
        setupListeners()
        setupCacheResult()
    }

    private fun setupCacheResult() {
        val valorCalculado = getSheredPref()
        resultado.text = valorCalculado.toString()
    }

    fun setupViews(){
        preco = findViewById(R.id.et_preco_km)
        btnCalcular = findViewById(R.id.btn_calcular2)
        kmPercorrido = findViewById(R.id.et_km_Percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnClose = findViewById(R.id.iv_close)


    }
    fun setupListeners(){
        btnCalcular.setOnClickListener {
            calcular()
        }
        btnClose.setOnClickListener{
            finish()
        }
    }
    fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()

        val result = preco/km
        resultado.text = result.toString()
        saveSharedPref(result)

    }

    fun saveSharedPref(resultado : Float){
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putFloat(getString(R.string.saved_calc), resultado)
            apply()
        }
    }

    fun getSheredPref() : Float {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        return sharedPref.getFloat(getString(R.string.saved_calc), 0.0f)
    }

}
