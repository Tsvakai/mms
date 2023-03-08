package com.mms.service.impl;

import com.mms.service.ClientService;
import com.mms.service.dto.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplimentation implements ClientService {
    @Override
    public ResponseEntity clientDetails(ClientDto detailsRequest){
        return null;
    }
}
