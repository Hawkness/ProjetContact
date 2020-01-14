package com.CESI.accessingdatajpa;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class AddressForm {

    @NotNull
    @Size(min=15, max=30)
    private String address;

    @NotNull
    @Size(min=4, max=5)
    private int postalCode;

    @NotNull
    @Size(min=2, max=15)
    private String city;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Addresse(Rue: " + this.address + ", Code Postal " + this.postalCode + ", Ville " + this.city + ")";
    }
}