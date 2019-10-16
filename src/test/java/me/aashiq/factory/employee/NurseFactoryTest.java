package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Nurse;
import org.junit.Assert;
import org.junit.Test;

public class NurseFactoryTest {

    @Test
    public void getNurse() {

        Nurse nurse = NurseFactory.getNurse( "Nursey", "Khan", "1234564", "1 May 2501", "Renal Nurse", "Super Nurse");
        System.out.println(nurse);
        Assert.assertNotNull(nurse);

    }
}