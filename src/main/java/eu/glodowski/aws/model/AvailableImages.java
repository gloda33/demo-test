package eu.glodowski.aws.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AvailableImages {
    AMI_1("ami-976152f2", "Amazon Linux AMI 2018.03.0 (HVM)"),
    AMI_2("ami-31c7f654", "Amazon Linux 2 LTS Candidate 2 AMI (HVM)"),
    AMI_3("ami-57d3e732", "SUSE Linux Enterprise Server 12 SP3 (HVM)"),
    AMI_4("ami-916f59f4", "Ubuntu Server 16.04 LTS (HVM)"),
    AMI_5("ami-03291866", "Red Hat Enterprise Linux 7.5 (HVM)"),
    AMI_6("ami-5984b43c", "Microsoft Windows Server 2016 Base"),
    AMI_7("ami-1be7d77e", "Deep Learning AMI (Ubuntu) Version 7.0"),
    AMI_8("ami-e0f7c785", "Deep Learning AMI (Amazon Linux) Version 7.0"),
    AMI_9("ami-f085b595", "Microsoft Windows Server 2008 R2 Base");

    private final String value;
    private final String name;

}
