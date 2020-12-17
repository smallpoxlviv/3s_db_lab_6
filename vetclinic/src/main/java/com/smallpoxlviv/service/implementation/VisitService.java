package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.VisitEntity;
import com.smallpoxlviv.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class VisitService extends GeneralServiceImpl<VisitEntity> {
    @Autowired
    VisitRepository visitRepository;

    @Override
    public JpaRepository<VisitEntity, Long> getRepository() {
        return visitRepository;
    }
}