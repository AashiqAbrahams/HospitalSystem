package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Hospital;
import me.aashiq.helper.IDGenerator;

public class HospitalFactory {

    public static Hospital getHospital (String hospitalName, String departments) {
        return new Hospital.HospitalBuilder()
                .hospitalId(IDGenerator.generateId())
                .departments(departments)
                .hospitalName(hospitalName)
                .build();
    }


}
