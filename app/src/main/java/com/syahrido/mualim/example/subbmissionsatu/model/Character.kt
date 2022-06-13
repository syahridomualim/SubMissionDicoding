package com.syahrido.mualim.example.subbmissionsatu.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val id: Int,
    val name: String,
    val gender: String,
    val status: String,
    val location: String?,
    val type: String?,
    val imageUrl: String?
) : Parcelable