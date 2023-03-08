package com.mms.service;

import com.mms.service.dto.ClientDto;
import org.springframework.http.ResponseEntity;

public interface ClientService {
    ResponseEntity clientDetails(ClientDto detailsRequest);
}
