package io.algo.demo.service_b.ctl

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ServiceBController {

    @Value("\${service.b.message}")
    private lateinit var message: String

    @GetMapping("/b/message")
    fun getMessage() : ResponseEntity<String> {
        return ResponseEntity.ok(message)
    }
}