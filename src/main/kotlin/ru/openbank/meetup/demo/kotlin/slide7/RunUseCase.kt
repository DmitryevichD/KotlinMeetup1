package ru.openbank.meetup.demo.kotlin.slide7

import com.fasterxml.jackson.databind.JsonNode

//private fun isValidNode(jsonNode: JsonNode?) = jsonNode?.also { it.isObject || it.isArray } ?: false

private fun isValidNode(jsonNode: JsonNode?) = jsonNode?.let { it.isObject || it.isArray } ?: false

