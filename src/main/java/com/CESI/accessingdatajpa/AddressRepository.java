
package com.CESI.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    List<Contact> findByAddress(String address);
    List<Contact> findByPostalCode(int postalCode);
    List<Contact> findByCity(String city);
}