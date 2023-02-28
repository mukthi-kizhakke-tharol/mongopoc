package com.example.reactive.mongodb.repository;

import com.example.reactive.mongodb.entity.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MemberRepository extends ReactiveMongoRepository<Member, Long> {

    Mono<Member> findByName(String name);
    Mono<Member> findByAddressId(Long id);
}
