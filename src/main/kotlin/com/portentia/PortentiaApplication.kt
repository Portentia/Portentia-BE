package com.portentia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class PortentiaApplication

internal const val  BASE_PACKAGE = "com.portentia"

fun main(args: Array<String>) {
    runApplication<PortentiaApplication>(*args)
}
