package com.sirelon.marsweather.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created on 05/03/2017 23:18.
 */
object apiProvider {
    val weatherApi: WeatherApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://marsweather.ingenology.com/v1/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        weatherApi = retrofit.create(WeatherApi::class.java)
    }
}