package com.pivincii.livedata_retrofit.ui.main

import androidx.lifecycle.ViewModel
import com.pivincii.livedata_retrofit.model.PokeApi
import com.pivincii.livedata_retrofit.network.RetrofitClient

class MainViewModel : ViewModel() {
    val pokeService = RetrofitClient().getRetrofit().create(PokeApi::class.java)
    val pokeCharacteristic = pokeService.getCharacteristic(1)
}
