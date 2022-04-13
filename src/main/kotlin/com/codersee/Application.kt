package com.codersee

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.codersee.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
