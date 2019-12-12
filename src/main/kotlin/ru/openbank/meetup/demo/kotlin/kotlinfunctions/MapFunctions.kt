package ru.openbank.meetup.demo.kotlin.kotlinfunctions

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    val mutableMap = mutableMapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )
    mutableMap.filter { it.value.color == "silver" }
    // nothing changes
    println("The filters map is $mutableMap")

    println(immutableMap.filter { it.value.year == 2016 })
    println(immutableMap)

    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List = mutableListOf<Int>()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)

    val add10List2 = ints.map { it + 10 }
    println(add10List2)

    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })

    println(immutableMap.toSortedMap())
}

data class Car(val color: String, val model: String, val year: Int)
