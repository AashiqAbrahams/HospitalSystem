package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Administration;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface AdministrationRepository extends Repository<Administration, String> {

    Set<Administration> getAll();


}
