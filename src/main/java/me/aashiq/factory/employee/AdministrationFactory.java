package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Administration;
import me.aashiq.helper.IDGenerator;


public class AdministrationFactory {

    public static Administration getAdministration(String firstName, String lastName, String identificationNumber, String employmentDate, String jobTitle, String access) {
        return (Administration) new Administration.AdminBuilder()
                .accessLevel(access)
                .employeeId(IDGenerator.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .identityNumber(identificationNumber)
                .employmentDate(employmentDate)
                .jobTitle(jobTitle)
                .build();
    }




}
