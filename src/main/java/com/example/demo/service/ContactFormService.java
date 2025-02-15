package com.example.demo.service;



import com.example.demo.entities.ContactForm;

import java.util.List;

public interface ContactFormService {
    ContactForm submitContactForm(ContactForm contactForm);
    List<ContactForm> getAllContactForms();
}