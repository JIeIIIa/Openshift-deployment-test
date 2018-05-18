package com.google.javagapps.openshift.phonebook.Controller;

import com.google.javagapps.openshift.phonebook.Entity.Contact;
import com.google.javagapps.openshift.phonebook.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ModelAndView allContacts(ModelAndView modelAndView) {
        List<Contact> contacts = contactService.findAll();
        modelAndView.addObject("contacts", contacts);
        modelAndView.addObject("contact", new Contact());
        modelAndView.setViewName("contacts/all");

        return modelAndView;
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact) {
        contactService.save(contact);

        return "redirect:/contacts";
    }
}
