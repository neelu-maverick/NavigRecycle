package com.example.navigrecycle.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.navigrecycle.R
import com.example.navigrecycle.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homebinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        homebinding = FragmentHomeBinding.inflate(inflater, container, false)

        return homebinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.let {
            Glide.with(it).load(
                "https://images.unsplash.com/photo-1619726578880-5da6b1be246c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1887&q=80"
            ).into(homebinding.imageBg)
        }

        homebinding.buttonHome.setOnClickListener {
            Navigation.findNavController(homebinding.root)
                .navigate(R.id.action_homeFragment_to_recyclerFragment)
        }
    }
}