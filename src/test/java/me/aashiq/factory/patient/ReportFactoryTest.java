package me.aashiq.factory.patient;

import me.aashiq.domain.patient.Report;
import org.junit.Assert;
import org.junit.Test;

public class ReportFactoryTest {

    @Test
    public void getReport() {

        Report report = ReportFactory.getReport( "Title", "Content", "IQR", "fasdfasdfasd");
        System.out.println();
        Assert.assertNotNull(report);


    }
}