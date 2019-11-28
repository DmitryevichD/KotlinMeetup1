package ru.openbank.meetup.demo.kotlin.slide6

data class ApplicationField(
    var name: String? = null,
    var type: String? = null,
    var regEx: String? = null,
    var isRequired: Boolean = false,
    var postProcessors: List<String>? = null,
    var ordersPath: String? = null
)
