package me.aashiq.service.employee;

import me.aashiq.domain.employee.Administration;
import me.aashiq.service.Service;

import java.util.Set;

public interface AdministrationService extends Service<Administration, String> {

    Set<Administration> getAll();

}
