package com.securitylessonone.securitylesson

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
class SecuritylessonApplication

fun main(args: Array<String>) {
	runApplication<SecuritylessonApplication>(*args)
}
