package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.PetEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pet")
public class PetController extends GeneralControllerImp<PetEntity>{
    @Autowired
    PetService petService;

    @Override
    public GeneralService<PetEntity> getService() {
        return petService;
    }
}