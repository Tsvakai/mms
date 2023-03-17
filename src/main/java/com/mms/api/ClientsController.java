package com.mms.api;

import com.mms.service.ClientService;
import com.mms.service.dto.ClientDto;
import com.mms.swagger.SwaggerConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.logging.Logger;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = {"/api/v1/clients"}, produces = APPLICATION_JSON_VALUE)
@Api(tags = SwaggerConstants.ClientDetails)
public class ClientsController {
//    private static final Logger logger =
//            (Logger) LoggerFactory.getLogger(ClientsController.class);
    private  static final String ID = "clientId";
    private  static  final String NEW_CLIENT_LOG = "New client was created id : {}";
   // private static final String CLIENT_UPDATE_LOG = "Client:{} was updated";
    private final ClientService detailsService;
    @Autowired
    public ClientsController(ClientService detailsService) {
        this.detailsService = detailsService;
    }
    @ApiOperation(value = "Create new client")
    @ApiResponse(code = 201, message = "Client is Created")
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
        public ResponseEntity clientDetails(@RequestBody ClientDto clientDto){
           // logger.info(NEW_CLIENT_LOG);
            return ResponseEntity.status(HttpStatus.CREATED).body(detailsService.clientDetails(clientDto));
        }
    }
