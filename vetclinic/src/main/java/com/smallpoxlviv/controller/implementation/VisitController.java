package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.VisitEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visit")
public class VisitController extends GeneralControllerImp<VisitEntity>{
    @Autowired
    VisitService visitService;

    @Override
    public GeneralService<VisitEntity> getService() {
        return visitService;
    }
}