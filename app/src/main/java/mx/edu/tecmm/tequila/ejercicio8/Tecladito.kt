package mx.edu.tecmm.tequila.ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)

        textView = findViewById(R.id.textView3)

        findViewById<Button>(R.id.button3).setOnClickListener {
            appendText("1")
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            appendText("2")
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            appendText("4")
        }

        findViewById<Button>(R.id.button6).setOnClickListener {
            removeLastCharacter()
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            appendText("5")
        }

        findViewById<Button>(R.id.button8).setOnClickListener {
            clearText()
        }
    }

    private fun appendText(text: String) {
        val currentText = textView.text.toString()
        textView.text = currentText + text
    }

    private fun removeLastCharacter() {
        val currentText = textView.text.toString()
        if (currentText.isNotEmpty()) {
            textView.text = currentText.substring(0, currentText.length - 1)
        }
    }

    private fun clearText() {
        textView.text = "0"
    }
}