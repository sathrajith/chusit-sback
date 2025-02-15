package com.example.demo.impl;


import com.example.demo.entities.ContactForm;
import com.example.demo.repository.ContactFormRepository;
import com.example.demo.service.ContactFormService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactFormServiceImpl implements ContactFormService {

    private final ContactFormRepository contactFormRepository;

    public ContactFormServiceImpl(ContactFormRepository contactFormRepository) {
        this.contactFormRepository = contactFormRepository;
    }

    @Override
    public ContactForm submitContactForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }

    @Override
    public List<ContactForm> getAllContactForms() {
        return contactFormRepository.findAll();
    }
}