package castro.menchaca.ignacio.apptarea1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val age = intent.getIntExtra("age", 0)
        interpretAge(age)
    }

    var rutaFoto = "Url"
    var resultado = "Res"

    private fun interpretAge(age:Int){
        when{
            age <= 5 -> {
                resultado = "Eres un Bebe de $age años"
                rutaFoto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPjqXK3nPa-PBbgVv_ZvV_KPx7izOPm1cyg7v9DvWk7YTjt1Wt"
            }
            age in 6..12 -> {
                resultado = "Eres un Niño de $age años"
                rutaFoto = "https://akphoto1.ask.fm/7c4/e93c7/4a51/4100/a594/098b63bab913/large/339233.jpg"
            }
            age in 13..17 -> {
                resultado = "Eres un adolecente de $age años"
                rutaFoto = "https://vignette.wikia.nocookie.net/memes-pedia/images/e/ea/300px-Why-not-template.jpg/revision/latest?cb=20140130002548&path-prefix=es"
            }
            age in 18..40 -> {
                resultado = "Eres un adulto joven de $age años"
                rutaFoto = "https://pbs.twimg.com/media/DY-SOGRXcAAjWh9.jpg"
            }
            age in 41..59 -> {
                resultado = "Eres un adulto mayor de $age años"
                rutaFoto = "http://static.t13.cl/images/sizes/1200x675/1527779025-1524749672-thanos-infinity-war-infinity-gauntlet.jpg"
            }
            age >= 60 -> {
                resultado = "Eres un anciano de $age años"
                rutaFoto = "https://i3.kym-cdn.com/photos/images/newsfeed/000/839/199/8a9.jpg"
            }
        }

        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado
    }
}
