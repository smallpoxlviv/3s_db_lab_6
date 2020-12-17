package com.smallpoxlviv.repository;

import com.smallpoxlviv.domain.implementation.DiagnosisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends JpaRepository<DiagnosisEntity, Long> {
}
