package me.aashiq.factory.employee;

import me.aashiq.domain.employee.Qualification;
import me.aashiq.helper.IDGenerator;

public class QualificationFactory {

    public static Qualification getQualification(String qualificationName, String instituteName, int duration) {
        return new Qualification.QualificationBuilder()
                .qualificationId(IDGenerator.generateId())
                .qualificationName(qualificationName)
                .instituteName(instituteName)
                .duration(duration)
                .build();
    }

}
