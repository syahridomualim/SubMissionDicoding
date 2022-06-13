package com.syahrido.mualim.example.subbmissionsatu.adapter

import com.syahrido.mualim.example.subbmissionsatu.model.Character

interface OnItemCallback {
    fun onItemClicked(character: Character)
}