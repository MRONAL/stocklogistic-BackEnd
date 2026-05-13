package com.stocklogistic.repository

import com.stocklogistic.models.Product

object ProductRepository {

    val products = mutableListOf<Product>()

    fun getAll(): List<Product> {
        return products
    }

    fun add(product: Product) {
        products.add(product)
    }

    fun delete(id: String) {
        products.removeIf { it.id == id }
    }

    fun update(id: String, updated: Product): Boolean {

        val index = products.indexOfFirst {
            it.id == id
        }

        if (index == -1) return false

        products[index] = updated

        return true
    }
}