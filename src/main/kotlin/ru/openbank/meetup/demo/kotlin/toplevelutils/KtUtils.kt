package ru.openbank.meetup.demo.kotlin.toplevelutils

fun <T> Collection<T>?.isNotNullOrEmpty(): Boolean = !this.isNullOrEmpty()

fun CharSequence?.isNotNullOrEmpty(): Boolean = !this.isNullOrEmpty()

fun CharSequence?.isNotNullOrBlank(): Boolean = !this.isNullOrBlank()

fun main() {
    val collectionIsNotNullOrEmpty = listOf("a", "b", "c").isNotNullOrEmpty()
    val nullableString: String? = "a"


    val notNullOrBlank = nullableString.isNotNullOrBlank()
    val notNullOrEmpty = nullableString.isNotNullOrEmpty()
}
