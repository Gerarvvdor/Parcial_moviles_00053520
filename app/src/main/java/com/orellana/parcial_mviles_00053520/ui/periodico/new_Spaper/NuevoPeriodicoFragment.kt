package com.orellana.parcial_mviles_00053520.ui.periodico.new_Spaper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.orellana.parcial_mviles_00053520.R
import com.orellana.parcial_mviles_00053520.data.model.NewspaperModel
import com.orellana.parcial_mviles_00053520.databinding.FragmentNuevoPeriodicoBinding
import com.orellana.parcial_mviles_00053520.databinding.FragmentPeriodicoBinding
import com.orellana.parcial_mviles_00053520.ui.periodico.viewmodel.NewspaperViewModel

class nuevoPeriodicoFragment : Fragment() {


    private lateinit var binding: FragmentNuevoPeriodicoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNuevoPeriodicoBinding.inflate(inflater, container, false)
        return binding.root
    }

}