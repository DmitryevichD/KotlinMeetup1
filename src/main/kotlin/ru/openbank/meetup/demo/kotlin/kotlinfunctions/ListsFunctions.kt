package ru.openbank.meetup.demo.kotlin.kotlinfunctions

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
//    val strings = arrayListOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDuplicateList = colorList.union(strings)
    println(noDuplicateList)

    val noDuplicateColors = colorList.distinct()
    println(noDuplicateColors)
}
