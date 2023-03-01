package com.example.reactive.mongodb.repository.normalized.ssib;

import com.example.reactive.mongodb.entity.normalized.ssib.EquipmentAndHaulage;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EquipmentAndHaulageRepository extends ReactiveMongoRepository<EquipmentAndHaulage, Long> {

    Flux<EquipmentAndHaulage> findByBookingCorrelationId(String bookingCorrelationId);
}
