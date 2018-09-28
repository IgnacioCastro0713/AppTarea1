package castro.menchaca.ignacio.apptarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            if ((etUser.text.toString() == "ignacio") and (etPass.text.toString() == "hola123")){
                toast("Bienvenido "+etUser.text.toString())
                val activity2: Intent = Intent(this, Main2Activity::class.java)
                startActivity(activity2)
            }else{
                if (etUser.text.toString()=="") {
                    etUser.error = "Usuario vacío"
                    toast("Usuario vacío!", Toast.LENGTH_SHORT)
                }
                if (etPass.text.toString()==""){
                    etPass.error = "Contraseña vacía"
                    toast("Contraseña vacío!", Toast.LENGTH_SHORT)
                }
            }
        }
    }


    fun toast(mensaje:String, duracion:Int = Toast.LENGTH_SHORT){
        Toast.makeText(applicationContext, mensaje, duracion).show()
    }
}
