package ru.openbank.meetup.demo.kotlin.slide1

/**
 * Содержит информацию, необходимую для отправки email.
 */
data class EmailDto(
    var subject: String? = null,
    var from: String? = null,
    var personal: String? = null,
    var to: List<String>? = null,
    var cc: List<String>? = null,
    var body: String? = null,
    var isHtml: Boolean = false
)
