package com.example.studyjamsession3.pathway7

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.studyjamsession3.R
import com.example.studyjamsession3.databinding.FragmentPathway7Binding



class Pathway7Fragment : Fragment() {

//    companion object {
//        fun newInstance() = Pathway7Fragment()
//    }

    private lateinit var viewModel: Pathway7ViewModel
    private lateinit var binding: FragmentPathway7Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pathway7
            , container, false)
        viewModel = ViewModelProvider(this).get(Pathway7ViewModel::class.java)
        binding.pathway7ViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.previousBt7.setOnClickListener {
            findNavController().navigate(R.id.action_pathway7Fragment_to_pathway62Fragment2)
        }
        return binding.root
        //return inflater.inflate(R.layout.fragment_pathway7, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Pathway7ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}