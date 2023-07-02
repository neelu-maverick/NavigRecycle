package com.example.navigrecycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigrecycle.databinding.RecyclerRowBinding

class PlaceAdapter :
    ListAdapter<PlaceModel, PlaceAdapter.PlaceViewHolder>(Diffutil()) {

    class Diffutil : DiffUtil.ItemCallback<PlaceModel>() {
        override fun areItemsTheSame(oldItem: PlaceModel, newItem: PlaceModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: PlaceModel,
            newItem: PlaceModel,
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): PlaceViewHolder {

        return PlaceViewHolder(
            RecyclerRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {

        RecyclerRowBinding.bind(holder.itemView).apply {
            placeName.text = currentList[position].placeName
            Glide.with(holder.itemView.context).load(currentList[position].placeImageUrl)
                .into(placeImg)
        }
    }

    inner class PlaceViewHolder(binding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root)
}

