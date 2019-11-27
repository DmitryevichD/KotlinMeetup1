package ru.openbank.meetup.demo.kotlin.delegation

class Application(
    private val mutableMap: MutableMap<String, String?> = HashMap()
) : MutableMap<String, String?> by mutableMap {

    var promo: String? by mutableMap
    var code: String? by mutableMap
    var phone: String? by mutableMap
    var type: String? by mutableMap
}

fun main() {
    val application = Application()

    application.promo = "a value"
    application.code = "another value"
    application.phone = "one more value"
    application.type = "even more value"

    val promo = application.promo
    val code = application.code
    val phone = application.phone
    val type = application.type
}
