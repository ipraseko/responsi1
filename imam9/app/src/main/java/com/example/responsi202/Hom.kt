package com.example.responsi202

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class Hom : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_hom)
            var listview = findViewById<ListView>(R.id.listview)
            var list = mutableListOf<Model>()

            list.add(Model("Liwet", "Food.", R.drawable.liwet))
            list.add(Model("Rawon", "Food.", R.drawable.rawon))
            list.add(Model("Lontong", "Food.", R.drawable.lontong))
            list.add(Model("Pecel", "Food.", R.drawable.pecel))
            list.add(Model("Soto", "Food", R.drawable.soto))
            list.add(Model("Rujak", "Food", R.drawable.rujak))
            list.add(Model("Mendoan", "Food", R.drawable.mendoan))

            listview.adapter = Adapter(this, R.layout.row, list)

            listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
                if (position == 0) {
                    Toast.makeText(
                        this@Hom,
                        "liwet adalah sebuah makanan khas jawa yang sering di jumpai di pinggir jalan",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 1) {
                    Toast.makeText(
                        this@Hom,
                        "rawon adalah sebuah makanan yang banyak di jumpai di jawa ",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 2) {
                    Toast.makeText(
                        this@Hom,
                        "lontong adalah makanan yang di buat dari nasi yang di bungkus daun pisang ",
                        Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 3) {
                    Toast.makeText(
                        this@Hom,
                        "pecel adalah makanan yang sering di buat mbah kamisah", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 4) {
                    Toast.makeText(
                        this@Hom,
                        "soto adalah makanan berkuah yang enak", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 5) {
                    Toast.makeText(
                        this@Hom,
                        "rujak adalah makanan khas indonesia ", Toast.LENGTH_LONG
                    ).show()
                }
                if (position == 6) {
                    Toast.makeText(
                        this@Hom,
                        "mendoan adalah makanan yang di goreng", Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

    }