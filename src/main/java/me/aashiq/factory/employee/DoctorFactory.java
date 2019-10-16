package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.helper.IDGenerator;


public class DoctorFactory {

    public static Doctor getDoctor(String firstName, String lastName, String identificationNumber, String employmentDate, String jobTitle, String specialisation) {
        return (Doctor) new Doctor.DoctorBuilder()
                .specialisation(specialisation)
                .employeeId(IDGenerator.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .identityNumber(identificationNumber)
                .employmentDate(employmentDate)
                .jobTitle(jobTitle)
                .build();
    }

}
