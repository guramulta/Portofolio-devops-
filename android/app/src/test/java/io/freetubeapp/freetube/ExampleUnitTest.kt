package io.freetubeapp.freetube

import io.freetubeapp.freetube.helpers.hexToColour
import io.freetubeapp.freetube.helpers.urlEncode
import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun hexToColour_black_isCorrect() {
        assertEquals(0xFF000000.toInt(), "#000000".hexToColour())
    }

    @Test
    fun urlEncode_space_isCorrect() {
        assertEquals("hello+world", "hello world".urlEncode())
    }
}

