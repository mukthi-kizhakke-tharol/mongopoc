package com.example.reactive.mongodb.config;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.mongodb.MongoClientSettings;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.bson.codecs.DocumentCodec;
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

    @Value("${connectionString}")
    private String connectionString;

    @Bean
    public DocumentCodec documentCodec() {
        return new CustomDocumentCodec();
    }

    @Override
    public MongoClient createReactiveMongoClient(MongoClientSettings settings) {
        return MongoClients.create(connectionString);
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
