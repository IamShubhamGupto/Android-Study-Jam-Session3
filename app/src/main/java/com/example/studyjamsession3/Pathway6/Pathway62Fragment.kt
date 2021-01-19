package com.example.studyjamsession3.Pathway6

import android.icu.number.Precision.increment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.studyjamsession3.R
import com.example.studyjamsession3.databinding.FragmentPathway61Binding
import com.example.studyjamsession3.databinding.FragmentPathway62Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pathway62Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pathway62Fragment : Fragment() {
    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
    private lateinit var binding : FragmentPathway62Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pathway6_2
            , container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pathway6_2, container, false)
//        binding.nextBt62.setOnClickListener {
//            findNavController().navigate(R.id.action_pathway6_1Fragment2_to_pathway6_2Fragment2)
//        }
        binding.previousBt62.setOnClickListener {
            findNavController().navigate(R.id.action_pathway62Fragment2_to_pathway61Fragment)
        }
        binding.previousBt62.setOnClickListener {
            findNavController().navigate(R.id.action_pathway62Fragment2_to_pathway61Fragment)
        }
        binding.plusBt62.setOnClickListener{increment()}
        binding.minusBt62.setOnClickListener{decrement()}
        return binding.root
    }

    private fun decrement() {
        var oldval = binding.display62.text.toString().toInt()
        binding.display62.setText(Integer.toString(oldval-1))
    }

    private fun increment(){
        var oldval = binding.display62.text.toString().toInt()
        binding.display62.setText(Integer.toString(oldval+1))
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment Pathway6_2Fragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            Pathway6_2Fragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}