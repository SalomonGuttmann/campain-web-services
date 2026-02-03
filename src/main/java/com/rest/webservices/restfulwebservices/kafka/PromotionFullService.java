package com.rest.webservices.restfulwebservices.kafka;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.webservices.restfulwebservices.jpa.PromotionFullEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class PromotionFullService {

    private final PromotionFullEventRepository repository;
    private final ObjectMapper objectMapper;

    public PromotionFullService(PromotionFullEventRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Transactional
    public void processEvent(
            String json,
            String key,
            int partition,
            long offset
    ) {
        try {
            JsonNode root = objectMapper.readTree(json);
            JsonNode promo = root.path("zpmsPromoFull");

            int offerId = promo.path("offerId").asInt();

            PromotionFullEventEntity entity = new PromotionFullEventEntity();
            entity.setOfferId(offerId);
            entity.setKafkaKey(key);
            entity.setKafkaPartition(partition);
            entity.setKafkaOffset(offset);
            entity.setPayload(json);
            entity.setReceivedAt(Instant.now());

            repository.save(entity);

        } catch (Exception e) {
            throw new RuntimeException("Invalid PromotionFull event", e);
        }
    }
}
