package com.smallpoxlviv.service.implementation;

import com.smallpoxlviv.domain.implementation.ScheduleEntity;
import com.smallpoxlviv.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class ScheduleService extends GeneralServiceImpl<ScheduleEntity> {
    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public JpaRepository<ScheduleEntity, Long> getRepository() {
        return scheduleRepository;
    }
}


