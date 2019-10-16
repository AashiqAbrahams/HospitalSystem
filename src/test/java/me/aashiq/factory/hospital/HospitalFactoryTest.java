package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Hospital;
import org.junit.Assert;
import org.junit.Test;

public class HospitalFactoryTest {

    @Test
    public void getHospital() {

        //Hospital
        Hospital hosp = HospitalFactory.getHospital("Greys Anamtomy", "List");
        System.out.println(hosp);

        Assert.assertNotNull(hosp);

    }
}