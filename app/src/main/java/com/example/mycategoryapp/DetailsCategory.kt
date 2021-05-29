package com.example.mycategoryapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.mycategoryapp.databinding.ActivityDetailsCategoryBinding
import androidx.appcompat.widget.Toolbar

class DetailsCategory : AppCompatActivity() {
    private lateinit var bind: ActivityDetailsCategoryBinding
    private lateinit var toolbar: Toolbar
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("UseCompatLoadingForDrawables")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailsCategoryBinding.inflate(layoutInflater)

        val intent = intent

        setContentView(bind.root)
        toolbar = bind.toolbar
        toolbar.title = intent.getStringExtra("CATEGORY")

        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.navigationIcon = getDrawable(R.drawable.back_icon)

        toolbar.setNavigationOnClickListener {
            setResult(0, intent)
            finish()
        }
    }
}
