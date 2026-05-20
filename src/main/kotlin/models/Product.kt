package com.stocklogistic.models

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Product(

    val id: String = UUID.randomUUID().toString(),

    val nombre: String,

    val categoria: String = "General",

    val marca: String = "",

    val tipoLeche: String = "",

    val cantidad: Int,

    val precio: Double = 0.0,

    val vencimiento: String = ""

)