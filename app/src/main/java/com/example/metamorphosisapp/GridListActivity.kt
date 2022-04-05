package com.example.metamorphosisapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.metamorphosisapp.adapter.MetaCardAdapter
import com.example.metamorphosisapp.const.Layout
import com.example.metamorphosisapp.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = MetaCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}