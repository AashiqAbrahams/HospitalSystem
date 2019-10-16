package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Department;
import me.aashiq.helper.IDGenerator;

public class DepartmentFactory {

    public static Department getDepartment(String wards, String rooms) {
        return new Department.DepartmentBuilder()
                .departmentId(IDGenerator.generateId())
                .wards(wards)
                .rooms(rooms)
                .build();
    }


}
