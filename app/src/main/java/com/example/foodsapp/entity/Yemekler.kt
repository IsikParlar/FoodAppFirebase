package com.example.foodsapp.entity

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Yemekler(
    var yemek_id: String? = "",
    var yemek_adi: String? = "",
    var yemek_resim_adi: String? = "",
    var yemek_fiyat: Int?= 0
) {

}