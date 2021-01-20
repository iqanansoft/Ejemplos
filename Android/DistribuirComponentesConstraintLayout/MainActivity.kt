package < nombrepaquete >

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

var contenedorPrincipal: ConstraintLayout?=null
var miNumero: EditText?=null
var botonVerificarNumeroPar: Button?=null
var textResultadoNumeroPar: TextView?=null
var numeroDivisor: EditText?=null
var botonVerificarNumeroDivisor: Button?=null
var textResultadoNumeroDivisor: TextView?=null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        contenedorPrincipal=findViewById(R.id.contenedorPrincipal)
        miNumero=findViewById(R.id.editTextNumeroComprobaciones)
        botonVerificarNumeroPar=findViewById(R.id.botonNumeroParComprobacion)
        textResultadoNumeroPar=findViewById(R.id.textResultadoNumeroParComprobacion)
        numeroDivisor=findViewById(R.id.editTextNumeroDivisorComprobacion)
        botonVerificarNumeroDivisor=findViewById(R.id.botonNumeroDivisorComprobacion)
        textResultadoNumeroDivisor=findViewById(R.id.textResultadoNumeroDivisorComprobacion)

        /*
        var unionesComponentesConstraint = ConstraintSet()
        //crear objecto ConstraintSet
        unionesComponentesConstraint.clone(contenedorPrincipal)
        unionesComponentesConstraint.connect(textResultadoNumeroPar!!.id,ConstraintSet.LEFT, botonVerificarNumeroPar!!.id,ConstraintSet.RIGHT,12)// margen expresado en px
        //unionesComponentesConstraint.connect(textResultadoNumeroPar!!.id,ConstraintSet.START, botonVerificarNumeroPar!!.id,ConstraintSet.END)
        //unionesComponentesConstraint.connect(textResultadoNumeroPar!!.id,ConstraintSet.TOP, ConstraintSet.PARENT_ID,ConstraintSet.TOP)
        unionesComponentesConstraint.constrainPercentWidth(botonVerificarNumeroPar!!.id,0.4f)// su ancho sera el 40 % del ancho del contenedor padre
        unionesComponentesConstraint.applyTo(contenedorPrincipal)
        */
    }

}
