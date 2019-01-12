package com.pivincii.livedata_retrofit.model

import androidx.lifecycle.LiveData
import com.pivincii.livedata_retrofit.network.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {
    @GET("characteristic/{id}")
    fun getCharacteristic(@Path("id") id: Int): LiveData<ApiResponse<PokeCharacteristic>>
}