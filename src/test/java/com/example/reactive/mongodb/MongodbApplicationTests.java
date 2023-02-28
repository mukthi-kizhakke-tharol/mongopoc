package com.example.reactive.mongodb;

import com.example.reactive.mongodb.entity.Book;
import com.example.reactive.mongodb.entity.Member;
import com.example.reactive.mongodb.entity.Publisher;
import com.example.reactive.mongodb.repository.BookRepository;
import com.example.reactive.mongodb.repository.MemberRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class MongodbApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BookRepository bookRepository;

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



}
