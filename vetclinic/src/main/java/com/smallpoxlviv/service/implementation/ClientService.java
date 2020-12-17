package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.ClientEntity;
import com.smallpoxlviv.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends GeneralServiceImpl<ClientEntity> {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public JpaRepository<ClientEntity, Long> getRepository() {
        return clientRepository;
    }
}
