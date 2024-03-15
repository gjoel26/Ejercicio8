package mx.edu.tecmm.tequila.ejercicio8

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun accion1(v: View){

        Log.w("Intenciones APP", "Se presiono el boton 1")
        val intencion1 = Intent(this, Tecladito::class.java)
        startActivity(intencion1)


    }
    fun accion2(v: View){
        Log.w("Intenciones APP", "Se presiono el boton 2")
        val aPagina = Intent(android.content.Intent.ACTION_VIEW)
        aPagina.data = Uri.parse("https://google.com.mx")
        startActivity(aPagina)
    }
}
