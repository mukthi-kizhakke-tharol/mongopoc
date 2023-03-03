package com.example.reactive.mongodb.entity.normalized.ssib;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Party {

    private String instanceId;
    private String maerskPartyCode;
    private String cmdCode;

    private String companyName;

    private String companyAddress;

    private String roleCode;

    private String partyReference;

    private ContactPerson partyContact;

    private String action;

    private String referenceInstanceId;

    private String referenceAction;

    private String name;

    private String roleName;

    public Party() {
    }

    public Party(String maerskPartyCode, String companyName, String companyAddress, String roleCode, String partyReference, String cmdCode, ContactPerson partyContact, String instanceId, String action, String referenceInstanceId, String referenceAction, String name, String roleName) {
        this.maerskPartyCode = maerskPartyCode;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.roleCode = roleCode;
        this.partyReference = partyReference;
        this.cmdCode = cmdCode;
        this.partyContact = partyContact;
        this.instanceId = instanceId;
        this.action = action;
        this.referenceInstanceId = referenceInstanceId;
        this.referenceAction = referenceAction;
        this.name = name;
        this.roleName = roleName;
    }

    public String getMaerskPartyCode() {
        return maerskPartyCode;
    }

    public void setMaerskPartyCode(String maerskPartyCode) {
        this.maerskPartyCode = maerskPartyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getPartyReference() {
        return partyReference;
    }

    public void setPartyReference(String partyReference) {
        this.partyReference = partyReference;
    }

    public String getCmdCode() {
        return cmdCode;
    }

    public void setCmdCode(String cmdCode) {
        this.cmdCode = cmdCode;
    }

    public ContactPerson getPartyContact() {
        return partyContact;
    }

    public void setPartyContact(ContactPerson partyContact) {
        this.partyContact = partyContact;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getReferenceInstanceId() {
        return referenceInstanceId;
    }

    public void setReferenceInstanceId(String referenceInstanceId) {
        this.referenceInstanceId = referenceInstanceId;
    }

    public String getReferenceAction() {
        return referenceAction;
    }

    public void setReferenceAction(String referenceAction) {
        this.referenceAction = referenceAction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
