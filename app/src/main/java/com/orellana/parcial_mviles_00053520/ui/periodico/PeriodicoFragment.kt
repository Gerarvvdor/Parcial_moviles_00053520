package com.orellana.parcial_mviles_00053520.ui.periodico

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.orellana.parcial_mviles_00053520.R
import com.orellana.parcial_mviles_00053520.databinding.FragmentPeriodicoBinding

class periodicoFragment : Fragment() {
    private lateinit var binding: FragmentPeriodicoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_periodico, container, false)
    }
}