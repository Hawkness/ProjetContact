package com.CESI.accessingdatajpa;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactForm {

    @NotNull
    @Size(min=1, max=5)
    private int id;

    @NotNull
    @Size(min=2, max=10)
    private String firstName;

    @NotNull
    @Size(min=2, max=10)
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Contact(ID : " + this.id + ",Prenom: " + this.firstName + ", Nom: " + this.lastName + ")";
    }
}