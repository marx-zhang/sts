package com.limebike.sys.controller;

import com.limebike.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rabbit")
public class RabbitMqController {
    private final AmqpTemplate amqpTemplate;

    public RabbitMqController(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @GetMapping("/send")
    public ResponseEntity<String> send() {
        amqpTemplate.convertAndSend(RabbitConfig.HELLO_WORLD_EXCHANGE,RabbitConfig.ROUTING_KEY,"Hello world!");
        return ResponseEntity.ok("ok");
    }
}
