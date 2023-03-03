package com.example.reactive.mongodb;

import com.example.reactive.mongodb.entity.Book;
import com.example.reactive.mongodb.entity.Member;
import com.example.reactive.mongodb.entity.Publisher;
import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import com.example.reactive.mongodb.entity.normalized.ssib.EquipmentAndHaulage;
import com.example.reactive.mongodb.repository.BookRepository;
import com.example.reactive.mongodb.repository.MemberRepository;
import com.example.reactive.mongodb.repository.normalized.ssib.BookingInformationRepository;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

@SpringBootTest
class MongodbApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookingInformationRepository bookingInformationRepository;

	@Test
	void contextLoads() {
		Flux<Member> all = memberRepository.findAll();
		StepVerifier.create(all)
				.consumeNextWith(member -> System.out.println(member.getName()))
				.verifyComplete();
		Mono<Member> mukthi = memberRepository.findByName("Mukthi");
		StepVerifier.create(mukthi)
				.consumeNextWith(member -> System.out.println(member.getName()))
				.verifyComplete();
	}

	@Test
	void testBook() {
		Publisher publisher = new Publisher("DC", null);
		Book book = new Book("Java", publisher);
		Mono<Book> save = bookRepository.save(book)
				.doOnNext(book1 -> System.out.println(book1))
				.doOnError(throwable -> System.out.println(throwable.getMessage()));
		StepVerifier.create(save)
				.consumeNextWith(b -> System.out.println(b.getName()))
				.verifyComplete();
	}

	@Test
	void testGetBook() {
		Mono<Book> book = bookRepository.findById(new ObjectId("63f8b74e510e525bb5551b4f"));
		StepVerifier.create(book)
				.consumeNextWith(b -> System.out.println(b.getName()))
				.thenConsumeWhile(x -> true)
				.verifyComplete();
	}

	@Test
	void testBookingInformationWith999EquipmentAndHaulage() throws IOException {
		String offerPayload = loadPayload("classpath:bookingInformation/bookingInformation.json");
		ObjectMapper objectMapper = new ObjectMapper()
				.registerModule(new JavaTimeModule())
				.setSerializationInclusion(JsonInclude.Include.NON_NULL)
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		BookingInformation bookingInformation = objectMapper.readValue(offerPayload, BookingInformation.class);
//		EquipmentAndHaulage equipmentAndHaulage = bookingInformation.getEquipmentAndHaulage().get(0);
		bookingInformation.setEquipmentAndHaulage(new ArrayList<>());
		for (int i = 0; i < 891; i++) {
			EquipmentAndHaulage equipmentAndHaulage = objectMapper.readValue(loadPayload("classpath:bookingInformation/equipmentAndHaulage.json"), EquipmentAndHaulage.class);
			bookingInformation.getEquipmentAndHaulage().add(equipmentAndHaulage);
		}
		Mono<BookingInformation> save = bookingInformationRepository.save(bookingInformation);
		StepVerifier.create(save)
				.consumeNextWith(b -> System.out.println(b.getCorrelationId()))
				.thenConsumeWhile(x -> true)
				.verifyComplete();
	}

	private static String loadPayload(String dataFilePath) throws IOException {
		File file = ResourceUtils.getFile(dataFilePath);
		return Files.readString(file.toPath());
	}



}
