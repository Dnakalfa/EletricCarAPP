package com.example.carroeletricoapp.data

import com.example.carroeletricoapp.domain.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarsAPI {

    //"https://dnakalfa.github.io/api-cars/cars.json"
    @GET("cars.json")
    fun getAllCars() : Call<List<Carro>>
}