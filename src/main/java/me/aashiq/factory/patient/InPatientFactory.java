package me.aashiq.factory.patient;

import me.aashiq.domain.patient.InPatient;
import me.aashiq.helper.IDGenerator;


public class InPatientFactory {

    public static InPatient getInPatient(String firstName, String lastName, String telephone, String identityNumber, int age, String accountId, String roomId, int days, String meal) {
        return (InPatient) new InPatient.InPatientBuilder()
                .roomId(roomId)
                .days(days)
                .mealId(meal)
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
