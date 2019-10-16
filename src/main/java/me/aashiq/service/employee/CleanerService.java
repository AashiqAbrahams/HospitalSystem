package me.aashiq.service.employee;

import me.aashiq.domain.employee.Cleaner;
import me.aashiq.service.Service;

import java.util.Set;

public interface CleanerService extends Service<Cleaner, String> {

    Set<Cleaner> getAll();

}
