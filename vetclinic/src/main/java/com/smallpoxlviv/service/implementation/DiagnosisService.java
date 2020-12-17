package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.DiagnosisEntity;
import com.smallpoxlviv.repository.DiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisService extends GeneralServiceImpl<DiagnosisEntity> {
    @Autowired
    DiagnosisRepository diagnosisRepository;

    @Override
    public JpaRepository<DiagnosisEntity, Long> getRepository() {
        return diagnosisRepository;
    }
}

