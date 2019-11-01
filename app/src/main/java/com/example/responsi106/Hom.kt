package com.example.responsi106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.responsi202.R

class Hom : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_hom)
            var listview = findViewById<ListView>(R.id.listview)
            var list = mutableListOf<Model>()

            list.add(Model("Liwet", "Food.", R.drawable.alphard))
            list.add(Model("Rawon", "Food.", R.drawable.bmw))
            list.add(Model("Lontong", "Food.", R.drawable.ferrari))
            list.add(Model("Pecel", "Food.", R.drawable.fortuner))
            list.add(Model("Soto", "Food", R.drawable.jazz))
            list.add(Model("Rujak", "Food", R.drawable.mazda))
            list.add(Model("Mendoan", "Food", R.drawable.mercy))

            listview.adapter = Adapter(this, R.layout.row, list)

            listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
                if (position == 0) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil Yang Bagus untuk keluarga",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 1) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang wajib dimiliki oleh orang kaya :v ",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 2) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang sangat nyaman ",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 3) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang kencang", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 4) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang sangat gagah", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 5) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang bagus untuk anak cewek", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 6) {
                    Toast.makeText(
                        this@Hom,
                        "Mobil yang berkecepatan tinggi", Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

    }