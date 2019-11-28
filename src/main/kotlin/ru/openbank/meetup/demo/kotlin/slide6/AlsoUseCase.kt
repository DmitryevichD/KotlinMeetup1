package ru.openbank.meetup.demo.kotlin.slide6

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun String?.regexMatches(fieldConfig: ApplicationField): Boolean {
    val regex = fetchRegex(fieldConfig)
    return when (regex) {
        null -> true.also { logger.trace("Regex is not specified for this field [${fieldConfig.name}]") }
        else -> this!!.matches(regex.toRegex())
    }
}

private fun fetchRegex(fieldConfig: ApplicationField): String? {
    return when {
        fieldConfig.regEx.isNotNullOrEmpty() -> fieldConfig.regEx
        fieldConfig.type.isNotNullOrEmpty() -> findRegExpByName(fieldConfig.type!!)
        else -> null
    }
}

private fun findRegExpByName(type: String): String? {
    return ""
}

private fun CharSequence?.isNotNullOrEmpty(): Boolean = !this.isNullOrEmpty()
