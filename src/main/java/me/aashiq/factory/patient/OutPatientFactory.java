package me.aashiq.factory.patient;

import me.aashiq.domain.patient.OutPatient;
import me.aashiq.helper.IDGenerator;


public class OutPatientFactory {

    public static OutPatient getOutPatient(String firstName, String lastName, String telephone, String identityNumber, int age, String accountId, String appointmentId) {
        return (OutPatient) new OutPatient.OutPatientBuilder()
                .appointmentId(appointmentId)
                .firstName(firstName)
                .lastName(lastName)
                .telephone(telephone)
                .identityNumber(identityNumber)
                .age(age)
                .accountId(accountId)
                .patientId(IDGenerator.generateId())
                .build();
    }

}
