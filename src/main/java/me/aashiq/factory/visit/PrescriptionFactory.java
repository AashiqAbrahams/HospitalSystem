package me.aashiq.factory.visit;

import me.aashiq.domain.visit.Prescription;
import me.aashiq.helper.IDGenerator;

public class PrescriptionFactory {


    public static Prescription buildPrescription(String medicationId, String visitId){

        return new Prescription(IDGenerator.generateId(), medicationId, visitId);
    }

}
