package com.rest.webservices.restfulwebservices.kafka;

import com.rest.webservices.restfulwebservices.campain.CampaignJpaResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;


@Component
public class PromotionFullConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(PromotionFullConsumer.class);
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
        LOG.info("Listener received message: {} with key: {} and partition: {}", message, key, partition);
        service.processEvent(message, key, partition, offset);
    }
}
