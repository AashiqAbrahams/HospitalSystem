package me.aashiq.service.employee;

import me.aashiq.domain.employee.Nurse;
import me.aashiq.service.Service;

import java.util.Set;

public interface NurseService extends Service<Nurse, String> {

    Set<Nurse> getAll();

}
