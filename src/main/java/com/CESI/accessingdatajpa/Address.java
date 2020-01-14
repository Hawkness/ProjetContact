package com.CESI.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String address;
    private int postalCode;
    private String city;

    protected Address() {}

    public Address(String address, int postalCode, String city) {
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format(
                "Contact[id=%d, address='%s', postalCode='%s', city='%s']",
                id, address, postalCode, city);
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}