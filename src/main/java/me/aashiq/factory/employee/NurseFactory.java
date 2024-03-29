package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Nurse;
import me.aashiq.helper.IDGenerator;

public class NurseFactory {

    public static Nurse getNurse(String firstName, String lastName, String identificationNumber, String employmentDate, String jobTitle, String type) {
        return (Nurse) new Nurse.NurseBuilder()
                .type(type)
                .employeeId(IDGenerator.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .identityNumber(identificationNumber)
                .employmentDate(employmentDate)
                .jobTitle(jobTitle)
                .build();
    }

}
