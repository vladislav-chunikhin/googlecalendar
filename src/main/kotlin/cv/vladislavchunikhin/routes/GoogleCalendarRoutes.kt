package cv.vladislavchunikhin.routes

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.*

fun Route.googleCalendarRouting() {
    route("/google-calendar") {
        get("/list") {
            call.respond("Custom routing")
        }
    }
}