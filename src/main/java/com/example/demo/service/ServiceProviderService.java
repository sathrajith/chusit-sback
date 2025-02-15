package com.example.demo.service;



import com.example.demo.entities.ServiceProvider;

import java.util.List;

public interface ServiceProviderService {
    ServiceProvider registerServiceProvider(ServiceProvider serviceProvider);
    List<ServiceProvider> getAllServiceProviders();
    List<String> getAllServiceProviderEmails();

}
