package com.veronym.aws.model;

import lombok.Data;


@Data
public class HostState {
    String ipAdress;
    Boolean isActive;
    String hostname;

    public HostState(){
        ipAdress="127.0.0.1";
        isActive=true;
        hostname="aws-server";
        System.out.println("New host");
    }
}
