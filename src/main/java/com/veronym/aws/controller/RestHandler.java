package com.veronym.aws.controller;

import com.veronym.aws.model.GetServerStatusRequest;
import com.veronym.aws.model.HostState;
import com.veronym.aws.model.ServerStatusResponse;
import com.veronym.aws.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class RestHandler {

    @Autowired
    private AwsService awsService;

    @RequestMapping(method = RequestMethod.GET)
    public HostState getHostState() {
        return awsService.getHostState();
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String getStatus(){
        return "Status: \n Wszytsko dziala!";
    }

    @PostMapping(value = "/import")
    @ResponseStatus(HttpStatus.OK)
    public ServerStatusResponse updateStatus(@RequestBody GetServerStatusRequest request){
        return new ServerStatusResponse();
    }
}

