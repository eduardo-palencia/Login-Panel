package mx.tec.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user = intent.getStringExtra("User")
        val password = intent.getStringExtra("Password")

        println(user + " " + password)
        Toast.makeText(this@MainActivity2, "Bienvenido", Toast.LENGTH_SHORT).show()
    }
}