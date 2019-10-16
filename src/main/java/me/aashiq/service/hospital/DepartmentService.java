package me.aashiq.service.hospital;

import me.aashiq.domain.hospital.Department;
import me.aashiq.service.Service;

import java.util.Set;

public interface DepartmentService extends Service<Department, String> {

    Set<Department> getAll();

}
