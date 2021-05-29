package com.example.mycategoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycategoryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    private lateinit var recycler: RecyclerView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        toolbar = bind.toolbar
        toolbar.title = "Contact Group"


        val list = listOf("Family", "Friends", "Colleague", "Tutor", "Work", "Devs")
        recycler = bind.recycler
        val layout = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL,false)
        val adapt = CustomCategoryAdapter(this, list)

        recycler.layoutManager = layout
        recycler.adapter = adapt

    }
}
