package com.orellana.parcial_mviles_00053520

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.orellana.parcial_mviles_00053520.data.model.NewspaperModel
import com.orellana.parcial_mviles_00053520.databinding.ActivityMainBinding
import com.orellana.parcial_mviles_00053520.ui.periodico.viewmodel.NewspaperViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private var viewModel : NewspaperViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}