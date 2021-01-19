package com.example.studyjamsession3.Pathway6

import android.icu.number.Precision.increment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.studyjamsession3.R
import com.example.studyjamsession3.databinding.FragmentEntryBinding
import com.example.studyjamsession3.databinding.FragmentPathway61Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pathway61Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pathway61Fragment : Fragment() {
    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        arguments?.let {
////            param1 = it.getString(ARG_PARAM1)
////            param2 = it.getString(ARG_PARAM2)
////        }
//
//    }
    private lateinit var binding: FragmentPathway61Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//    val binding: FragmentPathway61Binding = DataBindingUtil.inflate(
//        inflater, R.layout.fragment_pathway6_1, container, false)
//
//    binding.playGameButton.setOnClickListener {
//        findNavController().navigate(TitleFragmentDirections.actionTitleToGame())
//    }
//    return binding.root
    binding = DataBindingUtil.inflate(
        inflater, R.layout.fragment_pathway6_1, container, false)
    binding.nextBt61.setOnClickListener {
        findNavController().navigate(R.id.action_pathway61Fragment_to_pathway62Fragment2)
    }
    binding.previousBt61.setOnClickListener {
        findNavController().navigate(R.id.action_pathway61Fragment_to_entryFragment2)
    }
    binding.plusBt61.setOnClickListener{increment()}
        binding.minusBt61.setOnClickListener{decrement()}
    return binding.root

    }

    private fun decrement() {
        var oldval = binding.display61.text.toString().toInt()
        binding.display61.setText(Integer.toString(oldval-1))
    }

    private fun increment(){
        var oldval = binding.display61.text.toString().toInt()
        binding.display61.setText(Integer.toString(oldval+1))
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment Pathway6_1Fragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            Pathway6_1Fragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}