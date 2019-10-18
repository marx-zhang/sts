package com.limebike.sys.receiver;

import com.limebike.config.RabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMqReceiver {

    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.HELLO_WORLD_QUEUE)
    public void receiveHelloWorld(String message) {

        log.info("从hello world队列获取到消息为：" + message);

    }
}
