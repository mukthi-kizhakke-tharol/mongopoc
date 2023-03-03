package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackagingDetails {

    private DGPackaging outerPackaging;

    private List<DGPackaging> innerPackaging;

    private String commodityPackagingGroup;

    private String commodityPackagingType;

    public PackagingDetails() {
    }

    public PackagingDetails(DGPackaging outerPackaging, List<DGPackaging> innerPackaging, String commodityPackagingGroup, String commodityPackagingType) {
        this.outerPackaging = outerPackaging;
        this.innerPackaging = innerPackaging;
        this.commodityPackagingGroup = commodityPackagingGroup;
        this.commodityPackagingType = commodityPackagingType;
    }

    public DGPackaging getOuterPackaging() {
        return outerPackaging;
    }

    public void setOuterPackaging(DGPackaging outerPackaging) {
        this.outerPackaging = outerPackaging;
    }

    public List<DGPackaging> getInnerPackaging() {
        return innerPackaging;
    }

    public void setInnerPackaging(List<DGPackaging> innerPackaging) {
        this.innerPackaging = innerPackaging;
    }

    public String getCommodityPackagingGroup() {
        return commodityPackagingGroup;
    }

    public void setCommodityPackagingGroup(String commodityPackagingGroup) {
        this.commodityPackagingGroup = commodityPackagingGroup;
    }

    public String getCommodityPackagingType() {
        return commodityPackagingType;
    }

    public void setCommodityPackagingType(String commodityPackagingType) {
        this.commodityPackagingType = commodityPackagingType;
    }
}
