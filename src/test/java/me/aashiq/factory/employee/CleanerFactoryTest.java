package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Cleaner;
import org.junit.Assert;
import org.junit.Test;

public class CleanerFactoryTest {

    @Test
    public void getCleaner() {

        Cleaner cleaner = CleanerFactory.getCleaner("Tabeka", "Mwlaphembu", "000000", "N/A", "Cleaner", "Hair Massage");
        System.out.println(cleaner);
        Assert.assertNotNull(cleaner);

    }
}