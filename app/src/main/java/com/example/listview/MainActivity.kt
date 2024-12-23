package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complete Notes")
        taskList.add("Buy Resources")
        taskList.add("Improve Handwriting")
        taskList.add("Running")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)

        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { _, view, i, l ->
            val text = "Clicked on item: "+(view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}