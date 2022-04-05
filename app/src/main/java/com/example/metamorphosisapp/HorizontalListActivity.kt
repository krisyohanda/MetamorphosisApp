package com.example.metamorphosisapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.metamorphosisapp.adapter.MetaCardAdapter
import com.example.metamorphosisapp.const.Layout
import com.example.metamorphosisapp.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = MetaCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}