package com.sirelon.marsweather

import com.squareup.moshi.Json

/**
 * Created on 05/03/2017 22:51.
 */
data class WeatherData(
        //        "2017-03-01"
        @Json(name = "terrestrial_date")
        val earthDate: String,

        @Json(name = "sol")
        val sol: Long,

        @Json(name = "ls")
        val marsSeason: Double?,

        @Json(name = "min_temp")
        val minTempCelc: Double,

        @Json(name = "max_temp")
        val maxTempCelc: Double,

        @Json(name = "min_temp_fahrenheit")
        val minTempFahr: Double,

        @Json(name = "max_temp_fahrenheit")
        val maxTempFahr: Double,

        @Json(name = "pressure")
        val pressure: Double,

        @Json(name = "pressure_string")
        val pressureStr: String?,

        @Json(name = "abs_humidity")
        val absHumidity: Any?,

        @Json(name = "wind_speed")
        val windSpeed: Any?,

        @Json(name = "wind_direction")
        val windDirection: Any?,

        @Json(name = "atmo_opacity")
        val atmoOpacity: String?,

        @Json(name = "season")
        val season: String,

        @Json(name = "sunrise")
        val sunrise: String,

        @Json(name = "sunset")
        val sunset: String
)