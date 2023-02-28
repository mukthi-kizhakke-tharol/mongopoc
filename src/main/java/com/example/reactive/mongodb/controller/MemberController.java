package com.example.reactive.mongodb.controller;

import com.example.reactive.mongodb.entity.Member;
import com.example.reactive.mongodb.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/member")
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping
    public Flux<Member> getAll() {
        return memberRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Mono<Member> getOne(@PathVariable String name) {
        return memberRepository.findByName(name);
    }
    @GetMapping(value="/byAddress/{id}")
    public Mono<Member> byAddress(@PathVariable Long id) {
        return memberRepository.findByAddressId(id);
    }

    @PostMapping
    public Mono<Member> createMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }
}
