package ke.co.tukenya.learn_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toHomeButton = findViewById<Button>(R.id.about_button)

        toHomeButton.setOnClickListener{
//            Initialize intent
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}