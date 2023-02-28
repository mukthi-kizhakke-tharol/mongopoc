package com.example.reactive.mongodb.config;

import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferencePublisher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.mongodb.core.mapping.DocumentPointer;

/*@WritingConverter
public class DocumentReferencePublisherReferenceConverter implements Converter<DocumentReferencePublisher, DocumentPointer<Long>> {

    @Override
    public DocumentPointer<Long> convert(DocumentReferencePublisher source) {
        return () -> source.getId();
    }
}*/
