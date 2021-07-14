package com.example.kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MyDataAdapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewList = findViewById<RecyclerView>(R.id.recyclerviewList)

        val arrayList = arrayListOf(
            "Number One",
            "Number Two",
            "Number Three",
            "Number Four",
            "Number Five",
            "Number Six",
            "Number Seven",
            "Number Eight",
            "Number Nine",
            "Number Ten"
        )

        val adapter = MyDataAdapter(arrayList, this)
        recyclerViewList.adapter = adapter

        for (i in 0 until arrayList.size) {
            when (i) {
                4 -> Log.e("EXCEPTION", arrayList[i])
            }
            Log.e("VALUES-OF-ARRAY", arrayList[i])
        }
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Clicked on $position", Toast.LENGTH_SHORT).show()
    }
}