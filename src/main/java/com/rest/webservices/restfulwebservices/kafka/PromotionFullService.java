package com.rest.webservices.restfulwebservices.kafka;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.webservices.restfulwebservices.jpa.PromotionFullEventRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class PromotionFullService {

    private static final Logger LOG = LoggerFactory.getLogger(PromotionFullService.class);
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
        LOG.info("Service received PromotionFull event: {} with key: {} and partition: {}", json, key, partition);
        try {
            JsonNode root = objectMapper.readTree(json);
            JsonNode promo = root.path("zpmsPromoFull");

            int offerId = promo.path("offerId").asInt();

            PromotionFullEventEntity entity = new PromotionFullEventEntity();
            entity.setOfferId(offerId);
            entity.setKafkaKey(key);
            entity.setKafkaPartition(partition);
            entity.setKafkaOffset(offset);
            entity.setPayload(root);
            entity.setReceivedAt(Instant.now());

            LOG.info("Saving PromotionFull event: {}", entity);
            repository.save(entity);

        } catch (Exception e) {
            throw new RuntimeException("Invalid PromotionFull event", e);
        }
    }
}
