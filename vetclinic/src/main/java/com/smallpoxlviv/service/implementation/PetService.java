package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.PetEntity;
import com.smallpoxlviv.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class PetService extends GeneralServiceImpl<PetEntity> {
    @Autowired
    PetRepository petRepository;

    @Override
    public JpaRepository<PetEntity, Long> getRepository() {
        return petRepository;
    }
}


