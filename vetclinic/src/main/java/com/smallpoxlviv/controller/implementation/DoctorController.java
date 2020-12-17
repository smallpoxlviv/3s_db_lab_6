package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.DoctorEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController extends GeneralControllerImp<DoctorEntity>{
    @Autowired
    DoctorService doctorService;

    @Override
    public GeneralService<DoctorEntity> getService() {
        return doctorService;
    }
}