package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Ward;
import org.junit.Assert;
import org.junit.Test;

public class WardFactoryTest {

    @Test
    public void getWard() {

        Ward ward = WardFactory.getWard( "A");
        System.out.println(ward);
        Assert.assertNotNull("A", ward.getWardSize());

    }
}