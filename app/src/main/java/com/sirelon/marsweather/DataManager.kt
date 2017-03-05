package com.sirelon.marsweather

import android.content.Context
import com.sirelon.marsweather.network.apiProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created on 05/03/2017 23:08.
 */
class DataManager(val context: Context) {

    fun getLatestWeather(): Observable<WeatherData> {
        return apiProvider.weatherApi.getLatestWeather()
                .map { it.weatherData }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

}