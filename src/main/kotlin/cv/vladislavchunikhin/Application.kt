package cv.vladislavchunikhin

import cv.vladislavchunikhin.routes.googleCalendarRouting
import io.ktor.routing.*
import io.ktor.application.*

fun Application.main() {
    routing {
        googleCalendarRouting()
    }
}
