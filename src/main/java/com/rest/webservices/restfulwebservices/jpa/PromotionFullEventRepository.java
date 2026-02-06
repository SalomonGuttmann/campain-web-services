package com.rest.webservices.restfulwebservices.jpa;

import com.rest.webservices.restfulwebservices.kafka.PromotionFullEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionFullEventRepository
        extends JpaRepository<PromotionFullEventEntity, Long> {
}

