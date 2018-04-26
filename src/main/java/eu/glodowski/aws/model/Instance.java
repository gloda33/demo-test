package eu.glodowski.aws.model;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.model.InstanceType;
import lombok.Data;

@Data
public class Instance {
    double spotPrice = 0.03;
    int instanceCount = 1;
    InstanceType instanceType;
    String imageId;
    String awsRegion;
    Regions region;

}
