package com.pivincii.livedata_retrofit.model

import com.google.gson.annotations.SerializedName

data class PokeCharacteristic(
    val id: Int,
    @SerializedName("gene_modulo") val geneModulo: Int,
    @SerializedName("possible_values") val list: List<Int>
)