package com.smallpoxlviv.repository;

import com.smallpoxlviv.domain.implementation.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
}
