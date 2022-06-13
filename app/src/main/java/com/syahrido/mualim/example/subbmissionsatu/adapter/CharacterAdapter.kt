package com.syahrido.mualim.example.subbmissionsatu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.syahrido.mualim.example.subbmissionsatu.R
import com.syahrido.mualim.example.subbmissionsatu.databinding.ItemCharactersBinding
import com.syahrido.mualim.example.subbmissionsatu.model.Character

class CharacterAdapter(
    private val listCharacter: List<Character>,
    private val onItemCallback: OnItemCallback
) :
    RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(view, onItemCallback)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = listCharacter[position]
        holder.bind(character)
    }

    override fun getItemCount(): Int = listCharacter.size

    class CharacterViewHolder(
        private val binding: ItemCharactersBinding,
        private val onItemCallback: OnItemCallback
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character) {
            with(binding) {
                textName.text = character.name
                textGender.text = character.gender
                imageGender.setImageResource(if (character.gender == "Male") R.drawable.male else R.drawable.female)
                textLocation.text = character.location
                textTypeOfCharacter.text = character.type ?: "Unknown"
                textStatus.text = character.status
                imageStatus.setImageResource(
                    when(character.status) {
                        "Unknown" -> R.drawable.unknown
                        "Alive" -> R.drawable.alive
                        else -> R.drawable.off
                    }
                )
                Glide.with(root)
                    .load(character.imageUrl)
                    .into(imageUrl)
            }
            itemView.setOnClickListener { onItemCallback.onItemClicked(character) }
        }
    }

}