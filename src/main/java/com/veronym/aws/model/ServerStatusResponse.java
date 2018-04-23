package com.veronym.aws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(value = "true")
public class ServerStatusResponse {

}
