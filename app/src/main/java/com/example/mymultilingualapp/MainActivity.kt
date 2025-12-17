package com.example.mymultilingualapp
// Indica el paquet on es troba aquesta classe. Serveix per organitzar el projecte.

import androidx.appcompat.app.AppCompatActivity      // Classe base per a activitats compatbiles amb Material Design.
import android.os.Bundle                            // Permet rebre dades del cicle de vida de l'activitat.
import android.widget.Button                         // Classe per utilitzar botons.
import android.widget.TextView                       // Classe per utilitzar textos (TextView).
import android.widget.Toast                          // Classe per mostrar missatges emergents breus.


// Declaració de la classe MainActivity, que és una pantalla de l’aplicació.
class MainActivity : AppCompatActivity() {

    // Mètode que s’executa quan l’activitat es crea.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)           // Crida al mètode de la classe pare. Necessari sempre.
        setContentView(R.layout.activity_main)       // Assigna el layout XML que es mostrarà en pantalla.

        // -----------------------------
        // 🔹 Referències als elements de la UI (XML → Kotlin)
        // -----------------------------
        val txtTitle = findViewById<TextView>(R.id.txtTitle)   // Obté el TextView del missatge de benvinguda.
        val btnInfo  = findViewById<Button>(R.id.btnInfo)      // Obté el botó d'informació.
        val btnExit  = findViewById<Button>(R.id.btnExit)      // Obté el botó de sortir.

        // -----------------------------
        // 🔹 Acció del botó "Informació"
        // -----------------------------
        btnInfo.setOnClickListener {
            // Mostra un Toast amb el text traduït corresponent a hello_message
            Toast.makeText(
                this,                               // Context de l’activitat.
                getString(R.string.hello_message),  // Obté el text segons l'idioma del dispositiu.
                Toast.LENGTH_SHORT                  // Duració curta del missatge.
            ).show()                                // Mostra el Toast en pantalla.
        }

        // -----------------------------
        // 🔹 Acció del botó "Sortir"
        // -----------------------------
        btnExit.setOnClickListener {
            finish()    // Tanca l’activitat actual. Si és l'única, l'app es tanca visualment.
        }
    }
}
