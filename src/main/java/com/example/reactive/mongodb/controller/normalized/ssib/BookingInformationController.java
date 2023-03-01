package com.example.reactive.mongodb.controller.normalized.ssib;


import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import com.example.reactive.mongodb.repository.normalized.ssib.BookingInformationRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/booking-information/book")
public class BookingInformationController {

    private final BookingInformationRepository bookingInformationRepository;

    public BookingInformationController(BookingInformationRepository bookingInformationRepository) {
        this.bookingInformationRepository = bookingInformationRepository;
    }

    @PostMapping
    public Mono<BookingInformation> save(@RequestBody BookingInformation bookingInformation) {
        return bookingInformationRepository.save(bookingInformation);
    }

    @GetMapping
    public Flux<BookingInformation> findAll() {
        return bookingInformationRepository.findAll();
    }
}
