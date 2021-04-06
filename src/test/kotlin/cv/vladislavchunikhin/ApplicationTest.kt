package cv.vladislavchunikhin

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import kotlin.test.*
import io.ktor.server.testing.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ main() }) {
            handleRequest(HttpMethod.Get, "/google-calendar/list").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Custom routing", response.content)
            }
        }
    }
}