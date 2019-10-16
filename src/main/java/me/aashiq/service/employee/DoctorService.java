package me.aashiq.service.employee;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.service.Service;

import java.util.Set;

public interface DoctorService extends Service<Doctor, String> {

    Set<Doctor> getAll();

}
