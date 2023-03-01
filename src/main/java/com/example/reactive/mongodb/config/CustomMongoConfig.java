package com.example.reactive.mongodb.config;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.index.Index;

@Configuration
public class CustomMongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${databaseName}")
    private String dataBaseName;

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create();
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        ReactiveMongoTemplate reactiveMongoTemplate = new ReactiveMongoTemplate(mongoClient(), dataBaseName);
        reactiveMongoTemplate.indexOps(ManualRefBook.class).
                ensureIndex(new Index().on("manualRefPublisherId", Sort.Direction.ASC));
        return reactiveMongoTemplate;
    }

    @Override
    protected String getDatabaseName() {
        return dataBaseName;
    }

    @Override
    public boolean autoIndexCreation() {
        return true;
    }
}
