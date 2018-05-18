package com.google.javagapps.openshift.phonebook.Service;

import com.google.javagapps.openshift.phonebook.Entity.Contact;
import com.google.javagapps.openshift.phonebook.Repository.ContactJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactJpaRepository contactJpaRepository;

    @Autowired
    public ContactServiceImpl(ContactJpaRepository contactJpaRepository) {
        this.contactJpaRepository = contactJpaRepository;
    }

    @Override
    public void save(Contact contact) {
        contactJpaRepository.save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return contactJpaRepository.findAll();
    }

    @Override
    public Optional<Contact> findById(Long id) {
        return contactJpaRepository.findById(id);
    }
}
