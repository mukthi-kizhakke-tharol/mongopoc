/*
package com.example.reactive.mongodb.config;

import org.bson.Document;
import org.bson.codecs.DocumentCodec;
import org.bson.codecs.IdGenerator;
import org.bson.codecs.ObjectIdGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomDocumentCodec extends DocumentCodec {

    IdGenerator idGenerator = new ObjectIdGenerator();

    @Override
    public Document generateIdIfAbsentFromDocument(Document document) {
        if (!this.documentHasId(document)) {
            document.put("_id", this.idGenerator.generate());
        }

        return document;
    }

}
*/
