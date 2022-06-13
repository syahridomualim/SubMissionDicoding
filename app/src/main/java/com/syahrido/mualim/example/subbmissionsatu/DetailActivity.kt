package com.syahrido.mualim.example.subbmissionsatu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.syahrido.mualim.example.subbmissionsatu.databinding.ActivityDetailBinding
import com.syahrido.mualim.example.subbmissionsatu.databinding.ContentDetailBinding

import com.syahrido.mualim.example.subbmissionsatu.model.Character

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailBinding: ContentDetailBinding
    private var character: Character? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = binding.detailContent

        setContentView(binding.root)

        initView()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun initView() {
        val data = intent.getParcelableExtra<Character>(EXTRA_DATA)
        if (data != null) {
            character = data
        }

        with(detailBinding) {
            textName.text = character?.name
            textGender.text = character?.gender
            textTypeOfCharacter.text = character?.type ?: "Unknown"
            imageGender.setImageResource(if (character?.gender == "Male") R.drawable.male else R.drawable.female)
            textLocation.text = character?.location
            textStatus.text = character?.status
            imageStatus.setImageResource(
                when (character?.status) {
                    "Unknown" -> R.drawable.unknown
                    "Alive" -> R.drawable.alive
                    else -> R.drawable.off
                }
            )
            Glide.with(this@DetailActivity)
                .load(character?.imageUrl ?: R.drawable.photos)
                .into(imageProfile)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }


    companion object {
        const val EXTRA_DATA = "extra_data"
    }
}