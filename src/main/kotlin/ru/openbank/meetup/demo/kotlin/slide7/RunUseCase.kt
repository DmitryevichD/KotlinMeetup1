package ru.openbank.meetup.demo.kotlin.slide7

import com.fasterxml.jackson.databind.JsonNode

private fun isValidNode(jsonNode: JsonNode?) = jsonNode?.run { jsonNode.isObject || jsonNode.isArray } ?: false
