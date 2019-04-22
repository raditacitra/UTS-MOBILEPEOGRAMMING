package com.example.myapplication

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlinpermissions.KotlinPermissions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KotlinPermissions.with(this) // where this is an FragmentActivity instance
            .permissions(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.CAMERA,
                Manifest.permission.SEND_SMS,
                Manifest.permission.CALL_PHONE)
            .onAccepted {
                Toast.makeText(this, "Accesed" + BuildConfig.APPLICATION_ID, Toast.LENGTH_LONG).show()
            }
            .onDenied {
                Toast.makeText(this, "Denied", Toast.LENGTH_LONG).show()
            }
            .onForeverDenied {
                //List of forever denied permissions
            }
            .ask()
        //ketik disini

        btnPindahActivityExplisit.setOnClickListener {
            startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }

        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ImplisitIntentActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent: Intent = Intent(this, BundleIntentActivity::class.java)
            intent.putExtra("NAMAKU", "Radita Citra Oktaviyani")
            intent.putExtra("SEKOLAHKU", "UPGRIS")
            intent.putExtra("NPM", "16670072")
            intent.putExtra("ALAMAT", "Jl.Amarta 1 Cangkiran,Mijen,Semarang")
            startActivity(intent)
        }

    }
}
