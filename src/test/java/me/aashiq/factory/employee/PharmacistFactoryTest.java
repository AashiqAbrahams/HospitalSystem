package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Pharmacist;
import org.junit.Assert;
import org.junit.Test;

public class PharmacistFactoryTest {

    @Test
    public void getPharmacist() {

        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");
        System.out.println(pharmacist);
        Assert.assertNotNull(pharmacist);

    }
}