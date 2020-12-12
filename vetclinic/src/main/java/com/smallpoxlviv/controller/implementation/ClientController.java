package com.smallpoxlviv.controller.implementation;

import com.smallpoxlviv.domain.implementation.ClientEntity;
import com.smallpoxlviv.service.GeneralService;
import com.smallpoxlviv.service.implementation.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController extends GeneralControllerImp<ClientEntity>{
    @Autowired
    ClientService clientService;

    @Override
    public GeneralService<ClientEntity> getService() {
        return clientService;
    }
}
