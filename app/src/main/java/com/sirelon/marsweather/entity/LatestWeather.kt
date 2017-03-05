package com.sirelon.marsweather.entity

import com.sirelon.marsweather.WeatherData
import com.squareup.moshi.Json

/**
 * Created on 05/03/2017 23:11.
 */
class LatestWeather(
        @Json(name = "report")
        val weatherData: WeatherData
)