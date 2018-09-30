package castro.menchaca.ignacio.apptarea1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main3.*

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val imc = intent.getFloatExtra("imc", 0.0f)
        interpretaIMC(imc)
    }

    fun interpretaIMC(imc:Float){
        var rutaFoto = "URL"
        var resultado = "nose"

        when{
            imc <=18.4 -> {
                resultado = "Bajo peso"
                rutaFoto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyMMGffO-0GVwIRp-15rGIS1DHOFBiQck9-ZSoVrgDrkkYbX-I"
            }
            imc in 18.5..24.9 -> {
                resultado = "Peso normal"
                rutaFoto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStYkZO1ifukoAWKp-SNpTk64LUC2jiTHiDW258ImdZTukdANuQBg"
            }
            imc >=25 -> {
                resultado = "Sobre peso"
                rutaFoto = "https://www.abc.es/Media/201312/30/obesidad-semen--644x362.jpg"
            }
        }

        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado
    }
}
