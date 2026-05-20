package com.stocklogistic.routes

import com.stocklogistic.controllers.ProductController
import com.stocklogistic.models.Product
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.productRoutes() {

    val controller = ProductController()

    route("/products") {

        // 🔍 GET
        get {

            call.respond(
                controller.getProducts()
            )
        }

        // ➕ POST
        post {

            val product = call.receive<Product>()

            println(product)

            controller.addProduct(product)

            call.respond(
                HttpStatusCode.Created,
                product
            )
        }

        // ❌ DELETE
        delete("/{id}") {

            val id = call.parameters["id"]

            if (id != null) {

                controller.deleteProduct(id)

                call.respond(HttpStatusCode.OK)
            }
        }
        // ✏ UPDATE
        put("/{id}") {

            val id = call.parameters["id"]

            val updatedProduct = call.receive<Product>()

            if (id != null) {

                val updated = controller.updateProduct(
                    id,
                    updatedProduct
                )

                if (updated) {

                    call.respond(
                        HttpStatusCode.OK,
                        updatedProduct
                    )

                } else {

                    call.respond(
                        HttpStatusCode.NotFound,
                        "Producto no encontrado"
                    )
                }
            }
        }
    }
}