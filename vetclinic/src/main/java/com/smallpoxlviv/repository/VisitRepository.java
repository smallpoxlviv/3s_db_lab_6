package com.smallpoxlviv.repository;

import com.smallpoxlviv.domain.implementation.VisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<VisitEntity, Long> {
}
