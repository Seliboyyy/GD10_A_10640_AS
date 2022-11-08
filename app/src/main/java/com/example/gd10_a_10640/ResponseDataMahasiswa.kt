package com.example.gd10_a_10640

data class ResponseDataMahasiswa(
    @Serializedname("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>)