package com.sirelon.marsweather.network

import com.sirelon.marsweather.entity.LatestWeather
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created on 05/03/2017 23:09.
 */
interface WeatherApi {

    @GET("/latest/")
    fun getLatestWeather(): Observable<LatestWeather>ß

}