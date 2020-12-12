package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.DoctorEntity;
import com.smallpoxlviv.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class DoctorService extends GeneralServiceImpl<DoctorEntity> {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public JpaRepository<DoctorEntity, Long> getRepository() {
        return doctorRepository;
    }
}


