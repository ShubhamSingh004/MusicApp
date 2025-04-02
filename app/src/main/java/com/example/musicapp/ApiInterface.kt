package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("x-rapidapi-key: 6a5c43dbc1mshd39ce3632b2356cp130329jsn9fc91bb16635",
        "x-rapidapi-host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>
}