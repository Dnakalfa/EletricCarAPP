package com.example.carroeletricoapp.ui

import android.os.AsyncTask
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.carroeletricoapp.R
import java.net.HttpURLConnection
import java.net.URL

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

    }

}
