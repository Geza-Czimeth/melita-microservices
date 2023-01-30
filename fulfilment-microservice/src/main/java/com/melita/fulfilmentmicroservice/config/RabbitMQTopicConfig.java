package com.melita.fulfilmentmicroservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQTopicConfig {

    @Value("${rabbitmq.routing.order}")
    private String exchangeName;

    @Value("${rabbitmq.topic.order}")
    private String orderTopic;

    @Value("${rabbitmq.queue.fulfilment}")
    private String fulfilmentQueue;

    @Bean
    public Queue fulfilmentQueue() {
        return new Queue(fulfilmentQueue, true);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(exchangeName);
    }

    @Bean
    public Binding fulfilmentQueueBinding(Queue fulfilmentQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(fulfilmentQueue).to(topicExchange).with(orderTopic);
    }
}
