package castro.menchaca.ignacio.apptarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btnCalculaImc.setOnClickListener {
            if (!etPeso.text.equals("") and !etAltura.text.equals("")) {
                val peso = etPeso.text.toString().toFloat()
                val altura = etAltura.text.toString().toFloat()
                val imc = calculaIMC(peso, altura)
                val i = Intent(this, Main6Activity::class.java)
                i.putExtra("imc", imc)
                startActivity(i)
            }else {

                if (etPeso.text.toString()=="") {
                    etPeso.error = "Peso esta vacio"
                    toast("Peso vacio", Toast.LENGTH_SHORT)
                }
                if (etAltura.text.toString()=="") {
                    etAltura.error = "Altura esta vacio"
                    toast("Altura vacio", Toast.LENGTH_SHORT)
                }

            }
        }
    }
    fun calculaIMC(peso:Float, altura:Float):Float{
        return peso/(altura*altura)
    }

    fun toast(mensaje:String, duracion:Int = Toast.LENGTH_SHORT){
        Toast.makeText(applicationContext, mensaje, duracion).show()
    }
}
