package ru.openbank.meetup.demo.kotlin.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import ru.openbank.meetup.demo.kotlin.slide6.ApplicationField

@Component
@ConfigurationProperties(prefix = "application")
class ApplicationProperties(
    val regExpMap: Map<String, String>,
    val metadataFields: List<ApplicationField>
)
