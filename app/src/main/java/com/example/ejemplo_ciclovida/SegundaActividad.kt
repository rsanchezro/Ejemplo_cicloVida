package com.example.ejemplo_ciclovida

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SegundaActividad : AppCompatActivity() {
    var botonpulsado = true
    lateinit var micheck: CheckBox
    lateinit var boton:Button
/** Callback que es obligatorio implementar en una actvidad
    - Se ejecuta al principio de la creación de la actividad
    - Se usa para:
        - establecer el layaout a la actividad
        - Inicializar objetos de la actividad
        - Instanciar las vistas
        - Establecer los escuchadores
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.segunda_activity)

        initComponents()

    Log.i("CicloVida","Se ejecuta OnCreate, se crea la actividad")


    }
    /** Cuando la actividad  se vuelve visible al usuario */

    override fun onStart(){
        super.onStart()
        Log.i("CicloVida","Se ejecuta OnStart, la actividad se hace visible")
    }
/** La actividad tiene el foco ***/
    override fun onResume() {
        super.onResume()
        Log.i("CicloVida","Se ejecuta onResume, la actividad tiene el foco")
    }


    /**** La actividad pierde el foco principal pero es visible por detras ****/
    override fun onPause() {
        super.onPause()
        Log.i("CicloVida","Se ejecuta OnPause, la actividad pierde el foco principal, pero es visible")
    }

    /** La actividad deja de ser visible, pasa a 2º plano, aunque ocupa espacio en memoria **/
    override fun onStop() {
        super.onStop()
        Log.i("CicloVida","Se ejecuta onStop, la actividad ya no es visible,")
    }
    /** La actividad es finalizada (finish) o esta siendo destruida por el sistema para liberar espacio de memoria **/
    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloVida","Se ejecuta onDestroy, la actividad de destruye de memoria")
    }
    fun initComponents()
    {
        this.micheck=findViewById<CheckBox>(R.id.checkBox)
        this.boton=findViewById(R.id.button)
        this.boton.setOnClickListener {
            val builderdialog=AlertDialog.Builder(this)
            builderdialog.setMessage("Mensaje de prueba")
            builderdialog.setTitle("Titulo")
            val dialogo:AlertDialog=builderdialog.create()
            dialogo.show()
        }
    }
    fun pulsaboton(vista: View) {
        this.botonpulsado=!this.botonpulsado
        this.micheck.setChecked(this.botonpulsado)


    }
}