package com.shunya.reverse

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.function.Function

@SpringBootApplication
class LambdaApp {

    @Bean
    fun function(mathService: MathService, objectMapper: ObjectMapper): Function<NumberInput, NumberOutput?> {
        return Function {
            val output = NumberOutput()
            output.result = mathService.reverse(it.input)
            return@Function output
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(LambdaApp::class.java, *args)
        }
    }
}
