package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Qualification;
import org.junit.Assert;
import org.junit.Test;

public class QualificationFactoryTest {

    @Test
    public void getQualification() {

        Qualification qualification = QualificationFactory.getQualification("IT", "CPUT", 3);
        System.out.println(qualification);
        Assert.assertNotNull(qualification);

    }
}