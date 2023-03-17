package com.mms.service.impl;

import com.mms.domain.Client;
import com.mms.domain.status.Status;
import com.mms.persistence.ClientsRepository;
import com.mms.service.ClientService;
import com.mms.service.dto.ClientDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class ClientServiceImplementation implements ClientService {
    private ClientsRepository repository;
    public ClientServiceImplementation(ClientsRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity clientDetails(ClientDto detailsRequest){
        if (repository.existsByNationalId(detailsRequest.getNationalId()))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Client with same National Id already exist");
        Client clients = Client.builder()
                .name(detailsRequest.getName())
                .dob(detailsRequest.getDob())
                .nationalId(detailsRequest.getNationalId())
                .phone(detailsRequest.getPhone())
                .email(detailsRequest.getEmail())
                .address(detailsRequest.getAddress())
                .status(Status.ACTIVE)
                .build();
        return ResponseEntity.ok(repository.save(clients));
    }
}
