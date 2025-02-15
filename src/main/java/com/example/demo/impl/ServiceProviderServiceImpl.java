package com.example.demo.impl;



import com.example.demo.entities.ServiceProvider;
import com.example.demo.repository.ServiceProviderRepository;
import com.example.demo.service.ServiceProviderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {

    private final ServiceProviderRepository serviceProviderRepository;

    public ServiceProviderServiceImpl(ServiceProviderRepository serviceProviderRepository) {
        this.serviceProviderRepository = serviceProviderRepository;
    }

    @Override
    public ServiceProvider registerServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }

    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        return serviceProviderRepository.findAll();
    }

    @Override
    public List<String> getAllServiceProviderEmails() {
        return serviceProviderRepository.findAll().stream()
                .map(ServiceProvider::getEmail)
                .collect(Collectors.toList());
    }

}
