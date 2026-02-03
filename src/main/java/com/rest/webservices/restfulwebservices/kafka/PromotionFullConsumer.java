package com.rest.webservices.restfulwebservices.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;


@Component
public class PromotionFullConsumer {

    private final PromotionFullService service;

    public PromotionFullConsumer(PromotionFullService service) {
        this.service = service;
    }

    @KafkaListener(
            topics = "PromotionFull",
            groupId = "promotion-full-consumer"
    )
    public void consume(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_KEY) String key,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
            @Header(KafkaHeaders.OFFSET) long offset
    ) {
        service.processEvent(message, key, partition, offset);
    }
}

