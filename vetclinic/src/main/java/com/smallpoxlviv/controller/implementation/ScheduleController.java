package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.ScheduleEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("schedule")
public class ScheduleController extends GeneralControllerImp<ScheduleEntity>{
    @Autowired
    ScheduleService scheduleService;

    @Override
    public GeneralService<ScheduleEntity> getService() {
        return scheduleService;
    }
}