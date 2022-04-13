package com.codersee.plugins

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class MessageDto(val message: String)

fun Application.configureRouting() {
    routing {
        helloWorldRoute()
    }
}

fun Routing.helloWorldRoute() {
    route("/hello") {
        get {
            call.respond(HttpStatusCode.OK, MessageDto("Hello World!"))
        }
    }
}

