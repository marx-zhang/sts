package com.limebike.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String HELLO_WORLD_QUEUE = "hello.world.queue";
    public static final String HELLO_WORLD_EXCHANGE = "hello.world.exchange";
    public static  String ROUTING_KEY = "hello.world";

    @Bean
    public Queue helloWorldQueue() {
        return new Queue(HELLO_WORLD_QUEUE);
    }

    @Bean
    public TopicExchange helloWorldExchange() {
        return new TopicExchange(HELLO_WORLD_EXCHANGE);
    }

    @Bean
    public Binding helloWorldBinding() {

        return BindingBuilder.bind(helloWorldQueue()).to(helloWorldExchange()).with(ROUTING_KEY);
    }


}
