package com.example.reactive.mongodb.controller.normalized.ssib;


import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import com.example.reactive.mongodb.entity.normalized.ssib.EquipmentAndHaulage;
import com.example.reactive.mongodb.repository.normalized.ssib.BookingInformationRepository;
import com.example.reactive.mongodb.repository.normalized.ssib.EquipmentAndHaulageRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/booking-information/book")
public class BookingInformationController {

    private final BookingInformationRepository bookingInformationRepository;
    private final EquipmentAndHaulageRepository equipmentAndHaulageRepository;

    public BookingInformationController(BookingInformationRepository bookingInformationRepository, EquipmentAndHaulageRepository equipmentAndHaulageRepository) {
        this.bookingInformationRepository = bookingInformationRepository;
        this.equipmentAndHaulageRepository = equipmentAndHaulageRepository;
    }

    @PostMapping
    public Mono<BookingInformation> save(@RequestBody BookingInformation bookingInformation) {
        Flux<EquipmentAndHaulage> equipmentAndHaulageFlux = Mono.just(bookingInformation.getEquipmentAndHaulage())
                .flatMapMany(Flux::fromIterable);
        return equipmentAndHaulageRepository.saveAll(equipmentAndHaulageFlux)
                .map(equipmentAndHaulage -> {
                    bookingInformation.getEquipmentAndHaulageIds().add(equipmentAndHaulage.getId());
                    return bookingInformation;
                })
                .map(bookingInformation1 -> {
                    bookingInformation1.setEquipmentAndHaulage(new ArrayList<>());
                    return bookingInformation1;
                })
                .flatMap(bookingInformationRepository::save)
                .then(Mono.just(bookingInformation));
    }


    @GetMapping
    public Flux<BookingInformation> findAll() {
        return bookingInformationRepository.findAll();
    }

    @GetMapping("/byLookup")
    public Flux<BookingInformation> findByLookUp() {
        return bookingInformationRepository.findByLookUp();
    }
}
