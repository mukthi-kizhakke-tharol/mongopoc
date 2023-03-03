package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DangerousDocument {

    private String documentContent;

    private String documentName;

    private String contentType;

    @JsonAlias("dangerousGoodsAttachmentReference")
    private String attachmentId;

    public DangerousDocument() {
    }

    public DangerousDocument(String documentContent, String documentName, String contentType, String attachmentId) {
        this.documentContent = documentContent;
        this.documentName = documentName;
        this.contentType = contentType;
        this.attachmentId = attachmentId;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
}
