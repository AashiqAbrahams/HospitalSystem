package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Doctor;
import org.junit.Assert;
import org.junit.Test;

public class DoctorFactoryTest {

    @Test
    public void getDoctor() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");
        System.out.println(doctor);
        Assert.assertNotNull(doctor);
    }
}