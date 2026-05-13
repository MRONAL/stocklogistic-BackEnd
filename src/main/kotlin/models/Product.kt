package com.stocklogistic.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(

    val id: String,

    val nombre: String,

    val cantidad: Int

)