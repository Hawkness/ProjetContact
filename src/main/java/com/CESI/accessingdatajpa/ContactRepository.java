package com.CESI.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName(String lastName);

    Contact findById(int id);
}