package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.DiagnosisEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diagnosis")
public class DiagnosisController extends GeneralControllerImp<DiagnosisEntity>{
    @Autowired
    DiagnosisService diagnosisService;

    @Override
    public GeneralService<DiagnosisEntity> getService() {
        return diagnosisService;
    }
}
