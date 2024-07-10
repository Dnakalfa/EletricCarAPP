package com.example.carroeletricoapp.data

import com.example.carroeletricoapp.domain.Carro

object CarFactory {

    val list = listOf(
        Carro(
            id = 1,
            preco = "R$ 300.000,00",
            bateria = "300 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "https://dnakalfa.github.io/api-cars/image/eletric_car.png",
            isFavorite = false,
        ),
        Carro(
            id = 2,
            preco = "R$ 200.000,00",
            bateria = "320 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "https://dnakalfa.github.io/api-cars/image/tesla-model-3-red.png",
            isFavorite = false,
        ),
        Carro(
            id = 3,
            preco = "R$ 200.000,00",
            bateria = "320 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "https://dnakalfa.github.io/api-cars/image/tesla-model-x-azul.png",
            isFavorite = false,
        ),
        Carro(
            id = 4,
            preco = "R$ 200.000,00",
            bateria = "320 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "dnakalfa.github.io/api-cars/image/tesla-modeling-pickup.png",
            isFavorite = false,
        ),
        Carro(
            id = 5,
            preco = "R$ 200.000,00",
            bateria = "320 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "dnakalfa.github.io/api-cars/image/tesla-modeling-pickup.png",
            isFavorite = false,
        )
    )

}