package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_bundle_intent.*

class BundleIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_intent)

        val namaku = intent.getStringExtra("NAMAKU")
        val sekolahku = intent.getStringExtra("SEKOLAHKU")
        val npm = intent.getStringExtra("NPM")
        val alamat = intent.getStringExtra("ALAMAT")

        tvNama.text = namaku
        tvSekolahku.text = sekolahku
        tvNpm.text = npm
        tvAlamat.text = alamat


    }
}


