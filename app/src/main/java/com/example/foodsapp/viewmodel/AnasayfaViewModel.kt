package com.example.foodsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodsapp.entity.Yemekler
import com.example.foodsapp.repository.YemeklerDaoRepository

class AnasayfaViewModel: ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo = YemeklerDaoRepository()

    init {
        yemekleriYukle()
        yemeklerListesi = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle(){
        yrepo.tumYemekleriAl()
    }
}