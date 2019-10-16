package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface DoctorRepository extends Repository<Doctor, String> {

    Set<Doctor> getAll();

}
