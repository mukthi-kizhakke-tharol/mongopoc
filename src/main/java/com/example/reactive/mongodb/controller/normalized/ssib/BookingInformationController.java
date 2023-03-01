package com.example.reactive.mongodb.controller.normalized.ssib;


import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import com.example.reactive.mongodb.repository.normalized.ssib.BookingInformationRepository;
import com.example.reactive.mongodb.repository.normalized.ssib.EquipmentAndHaulageRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
        return Mono.just(bookingInformation.getEquipmentAndHaulage())
                .flatMap(equipmentAndHaulages -> Mono.just(equipmentAndHaulages)
                        .flatMapMany(Flux::fromIterable)
                        .flatMap(equipmentAndHaulageRepository::save)
                        .map(equipmentAndHaulage -> bookingInformation.getEquipmentAndHaulageIds().add(equipmentAndHaulage.getId()))
                        .then(Mono.just(bookingInformation)))
                .flatMap(bookingInformationRepository::save);
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
