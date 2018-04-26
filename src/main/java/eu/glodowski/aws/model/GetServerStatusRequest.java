package eu.glodowski.aws.model;

import lombok.Value;

@Value
public class GetServerStatusRequest {
    private String consumerSystem;
    private String consumerId;
    private String serverId;
}
