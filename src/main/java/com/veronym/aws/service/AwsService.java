package com.veronym.aws.service;

import com.amazonaws.regions.Regions;
import com.veronym.aws.model.HostState;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
//
import org.springframework.stereotype.Service;

//@Slf4j
@Service
@RequiredArgsConstructor
public class AwsService {


    public HostState getHostState() {
        return new HostState();
    }

    public void changeState() {
        System.out.println("Sukces");
    }

    public void createSecurityGroup(String groupName, String groupDecription, Regions region){
        CreateSecurityGroup.createSecurityGroup(groupName, groupDecription, region);
    }
}
