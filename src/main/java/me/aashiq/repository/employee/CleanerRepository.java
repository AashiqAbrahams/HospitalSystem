package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Cleaner;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface CleanerRepository extends Repository<Cleaner, String> {

    Set<Cleaner> getAll();


}
