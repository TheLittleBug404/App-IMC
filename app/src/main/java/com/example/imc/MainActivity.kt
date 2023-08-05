package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //colocaremos una variable inmutable para el splash que nos instala el splash
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //haremos dormir el hilo principal para que nuestro splash cargue en un segundo y no se vea muy rapido
        Thread.sleep(1000)
        //inicializamos el splash screen
        //lo colocamos en true para que no se vaya el splash
        //se coloca tru en caso de realizar una logica mientras carga el splash
        //logica como por ejemplo carga datos, ect
        screenSplash.setKeepOnScreenCondition{true}
        val intent = Intent(this,DetailActivity::class.java)
        startActivity(intent)
        finish()
    }
}