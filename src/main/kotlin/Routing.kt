package com.example

import com.stocklogistic.routes.productRoutes
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {

        productRoutes()

    }
}