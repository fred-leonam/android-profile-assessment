package com.thoughtworks.productssearch

import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductService @Inject constructor() {

    // Mock data
    private val mockProducts = listOf(
        Product("1", "Laptop", 999.99),
        Product("2", "Mouse", 29.99),
        Product("3", "Keyboard", 79.99),
        Product("4", "Monitor", 299.99),
        Product("5", "Headphones", 149.99)
    )

    /**
     * Searches for products matching the query.
     * Simulates network delay. Returns error if query is "error" (for testing error states)
     */
    suspend fun searchProducts(query: String): Result<List<Product>> {
        delay(1500) // Simulate a network delay here

        val normalized = query.trim()

        if (normalized.equals("error", ignoreCase = true)) {
            return Result.Error(IllegalStateException("Simulated search error"))
        }

        val results = if (normalized.isBlank()) {
            mockProducts
        } else {
            val q = normalized.lowercase()
            mockProducts.filter { product ->
                product.name.lowercase().contains(q) ||
                        product.id.lowercase().contains(q)
            }
        }

        return Result.Success(results)
    }
}