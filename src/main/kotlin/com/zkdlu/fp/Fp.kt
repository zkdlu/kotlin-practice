package com.zkdlu.fp

fun main() {
    val fruits = listOf(Fruit(1L, "사과", 1000L, 1000L))

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 10000L }

    fruits.sortedBy { fruit -> fruit.factoryPrice }
    fruits.distinctBy { fruit -> fruit.name }
        .map { it.name }

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    val map3: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    val map4: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1000, 1500),
            Fruit(2L, "사과", 1200, 1500),
            Fruit(3L, "사과", 1200, 1500),
            Fruit(4L, "사과", 1500, 1500),
        ),
        listOf(
            Fruit(5L, "수박", 2000, 3500),
            Fruit(6L, "수박", 2200, 3500),
            Fruit(7L, "수박", 2200, 3500),
        )
    )

    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    fruitsInList.flatMap { list -> list.samePriceFilter }

    val flattenFruits: List<Fruit> = fruitsInList.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}