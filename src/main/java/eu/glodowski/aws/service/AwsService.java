package eu.glodowski.aws.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.model.InstanceType;
import eu.glodowski.aws.model.HostState;
import eu.glodowski.aws.model.Instance;
import lombok.RequiredArgsConstructor;
//
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AwsService {

    public static void createInstance(Instance instance){

        String securityGroupName = "amazonSecurityGroup";
        createNewSecurityGroup(
                securityGroupName,
                "Security group created from application",
                instance.getRegion()
        );

        try {
            CreateInstance.sendRequest(instance.getImageId(), instance.getSpotPrice(), instance.getInstanceType(),
                    instance.getInstanceCount(), instance.getRegion(), securityGroupName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("aws: " + instance.getRegion().getName()
                + "\nprice: " + instance.getSpotPrice()
                + "\nimage: " + instance.getImageId()
                + "\ncount: " + instance.getInstanceCount()
                + "\ntype:" + instance.getInstanceType());
    }


    public HostState getHostState() {
        return new HostState();
    }

    public void changeState() {
        System.out.println("Sukces");
    }

    public static void createNewSecurityGroup(String groupName, String groupDecription, Regions region){
        CreateSecurityGroup.createSecurityGroup(groupName, groupDecription, region);
    }

    public void createNewInstance (){


    }
}
