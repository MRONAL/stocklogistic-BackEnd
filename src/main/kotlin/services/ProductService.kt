package com.stocklogistic.services

import com.stocklogistic.models.Product
import com.stocklogistic.repository.ProductRepository

class ProductService {

    fun getProducts(): List<Product> {
        return ProductRepository.getAll()
    }

    fun addProduct(product: Product) {
        ProductRepository.add(product)
    }

    fun deleteProduct(id: String) {
        ProductRepository.delete(id)
    }

    fun updateProduct(id: String, product: Product): Boolean {
        return ProductRepository.update(id, product)
    }
}