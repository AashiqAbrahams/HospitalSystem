package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Nurse;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface NurseRepository extends Repository<Nurse, String> {

    Set<Nurse> getAll();

}
