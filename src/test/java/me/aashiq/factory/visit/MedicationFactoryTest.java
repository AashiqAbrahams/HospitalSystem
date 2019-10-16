package me.aashiq.factory.visit;

import me.aashiq.domain.visit.Medication;
import org.junit.Assert;
import org.junit.Test;

public class MedicationFactoryTest {

    @Test
    public void getMedication() {

        Medication medication = MedicationFactory.getMedication("Panado", "Pain Killer", 2);
        Assert.assertNotNull(medication);

    }
}