package me.aashiq.factory.visit;

import me.aashiq.domain.visit.Medication;
import me.aashiq.helper.IDGenerator;

public class MedicationFactory {

    public static Medication getMedication(String medicineName, String dose, int quantity) {
        return new Medication.MedicationBuilder()
                .medicationId(IDGenerator.generateId())
                .medicineName(medicineName)
                .dose(dose)
                .quantity(quantity)
                .build();
    }


}
