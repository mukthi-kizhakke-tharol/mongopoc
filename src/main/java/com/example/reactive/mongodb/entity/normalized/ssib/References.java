package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class References {

    private String priceReference;

    private String senderSystem;

    private String commitmentServiceContract;

    private String customerProvidedContractNumber;


    private String businessUnitCode;

    private String deliveryAgreementType;

    private String productCode;


    // Contract value from AFLS
    private String serviceContract;

    private PMAClassification priceId;

    private PMAClassification offerId;

    private PMAClassification amendmentQuoteId;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate priceCalculationDate;

    public References() {
    }

    public References(String priceReference, String customerProvidedContractNumber, String senderSystem, String businessUnitCode, String deliveryAgreementType, String productCode, String commitmentServiceContract, String serviceContract, PMAClassification priceId, PMAClassification offerId, PMAClassification amendmentQuoteId, LocalDate priceCalculationDate) {
        this.priceReference = priceReference;
        this.customerProvidedContractNumber = customerProvidedContractNumber;
        this.senderSystem = senderSystem;
        this.businessUnitCode = businessUnitCode;
        this.deliveryAgreementType = deliveryAgreementType;
        this.productCode = productCode;
        this.commitmentServiceContract = commitmentServiceContract;
        this.serviceContract = serviceContract;
        this.priceId = priceId;
        this.offerId = offerId;
        this.amendmentQuoteId = amendmentQuoteId;
        this.priceCalculationDate = priceCalculationDate;
    }

    public String getPriceReference() {
        return priceReference;
    }

    public void setPriceReference(String priceReference) {
        this.priceReference = priceReference;
    }

    public String getCustomerProvidedContractNumber() {
        return customerProvidedContractNumber;
    }

    public void setCustomerProvidedContractNumber(String customerProvidedContractNumber) {
        this.customerProvidedContractNumber = customerProvidedContractNumber;
    }

    public String getSenderSystem() {
        return senderSystem;
    }

    public void setSenderSystem(String senderSystem) {
        this.senderSystem = senderSystem;
    }

    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public String getDeliveryAgreementType() {
        return deliveryAgreementType;
    }

    public void setDeliveryAgreementType(String deliveryAgreementType) {
        this.deliveryAgreementType = deliveryAgreementType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCommitmentServiceContract() {
        return commitmentServiceContract;
    }

    public void setCommitmentServiceContract(String commitmentServiceContract) {
        this.commitmentServiceContract = commitmentServiceContract;
    }

    public String getServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(String serviceContract) {
        this.serviceContract = serviceContract;
    }

    public PMAClassification getPriceId() {
        return priceId;
    }

    public void setPriceId(PMAClassification priceId) {
        this.priceId = priceId;
    }

    public PMAClassification getOfferId() {
        return offerId;
    }

    public void setOfferId(PMAClassification offerId) {
        this.offerId = offerId;
    }

    public PMAClassification getAmendmentQuoteId() {
        return amendmentQuoteId;
    }

    public void setAmendmentQuoteId(PMAClassification amendmentQuoteId) {
        this.amendmentQuoteId = amendmentQuoteId;
    }

    public LocalDate getPriceCalculationDate() {
        return priceCalculationDate;
    }

    public void setPriceCalculationDate(LocalDate priceCalculationDate) {
        this.priceCalculationDate = priceCalculationDate;
    }
}
