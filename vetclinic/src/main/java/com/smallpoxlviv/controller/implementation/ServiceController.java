package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.ServiceEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class ServiceController extends GeneralControllerImp<ServiceEntity>{
    @Autowired
    ServiceService serviceService;

    @Override
    public GeneralService<ServiceEntity> getService() {
        return serviceService;
    }
}