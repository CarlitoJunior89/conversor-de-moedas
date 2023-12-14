package com.example.conversordemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import org.json.JSONObject
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView2)
        val buttonConverter = findViewById<Button>(R.id.button)

        buttonConverter.setOnClickListener{
            converter()
        }

    }
    private fun converter(){
        val selectedCurrency = findViewById<RadioGroup>(R.id.radio_group)

        val checked = selectedCurrency.checkedRadioButtonId

        val currency = when(checked) {
            R.id.Dolar ->"Dolar"
            R.id.Euro ->"Euro"
            else      ->"Peso"

        }
       val editField = findViewById<EditText>(R.id.textView)
        val value = editField.text.toString()
        if (value.isEmpty())
            return
        result.text = value
        result.visibility = View.VISIBLE

        Thread {
            val url = URL("fca_live_uWnlW3tAxvDe8bOwvPEpoZ1TeNXP3bpqfJrKPJXE")
            val conn = url.openConnection() as HttpsURLConnection
            try {
                val data = conn.inputStream.bufferedReader().readText()
                val obj = JSONObject
                runOnUiThread {
                    val res = obj.getDouble("${currency}_BRL")
                    result.text = "R$${"%.4f".format(value.toDouble() * res)}"
                    result.visibility = View.VISIBLE
                }
            } finally {
                conn.disconnect()
            }
        }.start()

    }
}