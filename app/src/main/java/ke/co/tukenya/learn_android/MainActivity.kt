package ke.co.tukenya.learn_android

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.Manifest
import androidx.core.content.ContextCompat
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        if (ContextCompat.checkSelfPermission(this@MainActivity,
                Manifest.permission.ACCESS_FINE_LOCATION) !==
            PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this@MainActivity,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(this@MainActivity,
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
            } else {
                ActivityCompat.requestPermissions(this@MainActivity,
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
            }
        }

//        IMPLICIT INTENT
//        val urlInput = findViewById<EditText>(R.id.url_input)
//        val url = urlInput.text.toString()

//        val goButton = findViewById<Button>(R.id.go_button)
//
//        goButton.setOnClickListener {
//            val implitIntent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.javatpoint.com/")
//            startActivity(implitIntent)
//        }
//
//
//
////        Explicit Intent.
//        val toAboutButton = findViewById<Button>(R.id.home_button)
//
//        toAboutButton.setOnClickListener{
////            Initialize intent
//            val intent = Intent(this, AboutActivity::class.java)
//            startActivity(intent)
//        }

//        val queue = Volley.newRequestQueue(this)
//        val url = "https://mtekcdnstoragev2.blob.core.windows.net/admin/mcfish/students.json"
//
//        val stringRequest = StringRequest(
//            Request.Method.GET, url,
//            Response.Listener<String> { response ->
//
//                Log.i("RESPONSE", "The response is:$response")
//
//            },
//            Response.ErrorListener { Log.e("ERROR", "FEtch unsuccessful ", ) })
//
//        queue.add(stringRequest)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>,
                                            grantResults: IntArray) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            1 -> {
                if (grantResults.isNotEmpty() && grantResults[0] ==
                    PackageManager.PERMISSION_GRANTED) {
                    if ((ContextCompat.checkSelfPermission(this@MainActivity,
                            Manifest.permission.ACCESS_FINE_LOCATION) ===
                                PackageManager.PERMISSION_GRANTED)) {
                        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
                }
                return
            }
        }
    }
}