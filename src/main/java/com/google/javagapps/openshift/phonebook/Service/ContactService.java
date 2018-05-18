package com.google.javagapps.openshift.phonebook.Service;

import com.google.javagapps.openshift.phonebook.Entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    void save(Contact contact);

    List<Contact> findAll();

    Optional<Contact> findById(Long id);
}
