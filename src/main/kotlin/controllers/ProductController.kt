package com.stocklogistic.controllers

import com.stocklogistic.models.Product
import com.stocklogistic.services.ProductService

class ProductController {

    private val service = ProductService()

    fun getProducts(): List<Product> {
        return service.getProducts()
    }

    fun addProduct(product: Product) {
        service.addProduct(product)
    }

    fun deleteProduct(id: String) {
        service.deleteProduct(id)
    }

    fun updateProduct(id: String, product: Product): Boolean {
        return service.updateProduct(id, product)
    }
}