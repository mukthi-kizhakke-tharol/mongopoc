package com.example.reactive.mongodb.repository.normalized.ssib;

import com.example.reactive.mongodb.entity.normalized.ssib.EquipmentAndHaulage;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EquipmentAndHaulageRepository extends ReactiveMongoRepository<EquipmentAndHaulage, Long> {
}
