package com.smallpoxlviv.repository;

import com.smallpoxlviv.domain.implementation.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
