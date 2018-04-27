package eu.glodowski.aws.model;

import com.amazonaws.regions.Regions;
import lombok.Data;

@Data
public class Instance {
    double spotPrice = 0.03;
    int instanceCount = 1;
    String instanceType;
    String imageId;
    String awsRegion;
    Regions region;
}
