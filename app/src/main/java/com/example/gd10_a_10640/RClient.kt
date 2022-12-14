package com.example.gd10_a_10640

import com.example.gd10_a_10640.api

object RClient {
    private const val BASE_URL = "http://192.168.0.100/ci4-
    apiserver/public/"
    val instances: api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}
