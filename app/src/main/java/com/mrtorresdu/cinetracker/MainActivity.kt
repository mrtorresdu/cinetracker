package com.mrtorresdu.cinetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            val response = RetrofitInstance.movieApi.getMovies("62b4032b111270e66a06abbf7f09d07f")
            println(response.body()?.results)
        }
    }
}