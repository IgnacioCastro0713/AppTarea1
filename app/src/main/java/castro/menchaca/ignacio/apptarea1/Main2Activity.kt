package castro.menchaca.ignacio.apptarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnCalcular.setOnClickListener {
            if (etYear.text.toString() != ""){
                val year = etYear.text.toString().toInt()
                val age = calYear(year)
                val activity3 = Intent(this, Main3Activity::class.java)
                activity3.putExtra("age", age)
                startActivity(activity3)
            }else{
                etYear.error = "Campo año esta vació"
                Toast.makeText(applicationContext, "Campo Vacío", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun calYear(year:Int):Int{
        val date = Calendar.getInstance().get(Calendar.YEAR)
        return date - year
    }
}
