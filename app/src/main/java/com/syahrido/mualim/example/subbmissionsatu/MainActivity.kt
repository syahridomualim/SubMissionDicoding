package com.syahrido.mualim.example.subbmissionsatu

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.syahrido.mualim.example.subbmissionsatu.adapter.CharacterAdapter
import com.syahrido.mualim.example.subbmissionsatu.adapter.OnItemCallback
import com.syahrido.mualim.example.subbmissionsatu.data.DataSource
import com.syahrido.mualim.example.subbmissionsatu.databinding.ActivityMainBinding
import com.syahrido.mualim.example.subbmissionsatu.model.Character

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

    }

    private fun initRecyclerView() {
//        init data
        val listCharacters = DataSource().listCharacters()

        val recyclerView = binding.recyclerView
        recyclerView.adapter = CharacterAdapter(listCharacters, object : OnItemCallback {
            override fun onItemClicked(character: Character) {
                moveToDetails(character)
            }
        })

        recyclerView.setHasFixedSize(true)

    }

    private fun moveToDetails(character: Character) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DATA, character)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_me) {
            val me = Character(
                id = 1,
                name = "Mu'alim Syahrido",
                status = "Alive",
                location = "Jakarta, Indonesia",
                gender = "Male",
                type = "Human",
                imageUrl = null
            )
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DATA, me)
            startActivity(intent)
        }
        return true
    }
}