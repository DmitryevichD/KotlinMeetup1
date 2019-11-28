package ru.openbank.meetup.demo.kotlin.autowiring

import org.springframework.stereotype.Service
import ru.openbank.meetup.demo.java.autowiring.CodeGeneratorService

@Service
class CodeGeneratorImpl(
    private val usedCodeRepository: UsedCodeRepository
) : CodeGeneratorService {

}
