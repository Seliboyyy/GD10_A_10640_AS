package com.example.gd10_a_10640

data class MahasiswaData()
data class MahasiswaData(
    @SerializedName("mhsnobp") val nim:String,
    @SerializedName("mhsnama") val nama:String,
    @SerializedName("mhsalamat") val alamat:String,
    @SerializedName("prodinama") val prodi:String,
    @SerializedName("mhstgllhr") val tgllhr:String,