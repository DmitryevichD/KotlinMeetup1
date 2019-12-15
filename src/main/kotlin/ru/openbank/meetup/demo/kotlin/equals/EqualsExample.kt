package ru.openbank.meetup.demo.kotlin.equals

fun main(args: Array<String>) {
    //Equals with common class
    println("Default kotlin '==': ${CommonClass() == CommonClass()}")
    println("Default kotlin 'equals': ${CommonClass().equals(CommonClass())}")

    //Equals with data class
    println("Default kotlin '==': ${DataClass() == DataClass()}")
    println("Default kotlin 'equals': ${DataClass().equals(DataClass())}")
    println("Default kotlin 'equals': ${DataClass().hashCode() == DataClass().hashCode()}")

    println("Default kotlin '===': ${DataClass() === DataClass()}")

}

class CommonClass(val variable: Int = 10)
data class DataClass(val variable: Int = 10)
