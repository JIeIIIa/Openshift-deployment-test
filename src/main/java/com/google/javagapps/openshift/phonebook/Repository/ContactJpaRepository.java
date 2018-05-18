package com.google.javagapps.openshift.phonebook.Repository;

import com.google.javagapps.openshift.phonebook.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactJpaRepository extends JpaRepository<Contact, Long> {

}
