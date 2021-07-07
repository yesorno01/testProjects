package com.testj.vo;

import org.apache.commons.lang.StringEscapeUtils;

import javax.lang.model.element.NestingKind;

public class Stores {
    public float lat;
    public float lng;
    public String address;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
