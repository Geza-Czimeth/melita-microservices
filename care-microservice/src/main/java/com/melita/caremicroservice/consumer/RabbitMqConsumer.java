package com.melita.caremicroservice.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.care}")
    public void consume(String order) {
        log.info(String.format("Care system received order  -> %s", order));
    }
}
