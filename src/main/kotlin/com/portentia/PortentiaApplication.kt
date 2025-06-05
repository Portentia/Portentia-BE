package com.portentia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PortentiaApplication

fun main(args: Array<String>) {
    runApplication<PortentiaApplication>(*args)
}
