package com.example.navigrecycle.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigrecycle.PlaceAdapter
import com.example.navigrecycle.PlaceModel
import com.example.navigrecycle.databinding.FragmentRecyclerBinding

class RecyclerFragment : Fragment() {

    private lateinit var recyclerBinding: FragmentRecyclerBinding
    private val placeList: ArrayList<PlaceModel> = ArrayList()
    private lateinit var placeAdapter: PlaceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        recyclerBinding = FragmentRecyclerBinding.inflate(inflater, container, false)

        return recyclerBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        placeAdapter.submitList(placeList)
        addPlaces()

    }

    private fun initRecyclerView() {

        placeAdapter = PlaceAdapter()
        recyclerBinding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = placeAdapter
            setHasFixedSize(true)
        }


    }

    private fun addPlaces() {
        placeList.add(
            PlaceModel(
                "Sea",
                "https://images.unsplash.com/photo-1558901591-3a5f333830dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )
        placeList.add(
            PlaceModel(
                "Tomb",
                "https://images.unsplash.com/photo-1570573057137-dfa2165e148e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "River Bridge",
                "https://images.unsplash.com/photo-1543574882-785d864cbaca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1051&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "Mountain View",
                "https://images.unsplash.com/photo-1593461068733-7dffdd347dcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )

        placeList.add(
            PlaceModel(
                "Sea",
                "https://images.unsplash.com/photo-1558901591-3a5f333830dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )
        placeList.add(
            PlaceModel(
                "Tomb",
                "https://images.unsplash.com/photo-1570573057137-dfa2165e148e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "River Bridge",
                "https://images.unsplash.com/photo-1543574882-785d864cbaca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1051&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "Mountain View",
                "https://images.unsplash.com/photo-1593461068733-7dffdd347dcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )
        placeList.add(
            PlaceModel(
                "Sea",
                "https://images.unsplash.com/photo-1558901591-3a5f333830dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )
        placeList.add(
            PlaceModel(
                "Tomb",
                "https://images.unsplash.com/photo-1570573057137-dfa2165e148e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "River Bridge",
                "https://images.unsplash.com/photo-1543574882-785d864cbaca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1051&q=80"

            )
        )
        placeList.add(
            PlaceModel(
                "Mountain View",
                "https://images.unsplash.com/photo-1593461068733-7dffdd347dcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
            )
        )

    }
}