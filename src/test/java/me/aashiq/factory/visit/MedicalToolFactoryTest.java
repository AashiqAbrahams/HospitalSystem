package me.aashiq.factory.visit;

import me.aashiq.domain.visit.MedicalTool;
import org.junit.Assert;
import org.junit.Test;

public class MedicalToolFactoryTest {

    @Test
    public void getMedicalTool() {

        MedicalTool medicalTool = MedicalToolFactory.getMedicalTool("fas", "fasd");
        Assert.assertNotNull(medicalTool);

    }
}