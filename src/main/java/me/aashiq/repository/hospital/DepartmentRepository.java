package me.aashiq.repository.hospital;


import me.aashiq.domain.hospital.Department;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface DepartmentRepository extends Repository<Department, String> {

    Set<Department> getAll();


}
