package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.ServiceEntity;
import com.smallpoxlviv.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class ServiceService extends GeneralServiceImpl<ServiceEntity> {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public JpaRepository<ServiceEntity, Long> getRepository() {
        return serviceRepository;
    }
}