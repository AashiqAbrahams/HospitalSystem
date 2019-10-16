package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.helper.IDGenerator;

public class PharmacistFactory {

    public static Pharmacist getPharmacist(String firstName, String lastName, String identificationNumber, String employmentDate, String jobTitle, String license) {
        return (Pharmacist) new Pharmacist.PharmacistBuilder()
                .licence(license)
                .employeeId(IDGenerator.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .identityNumber(identificationNumber)
                .employmentDate(employmentDate)
                .jobTitle(jobTitle)
                .build();
    }

}
