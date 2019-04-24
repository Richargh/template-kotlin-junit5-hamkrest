package de.richargh.template.kotlinjunit5hamkrest

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

@DisplayName("A car")
class CarTest {

    @Test
    fun `can honk`(){
        val car = Car()

        val actual = car.honk()

        assertThat(actual, equalTo("honk"))
    }
}