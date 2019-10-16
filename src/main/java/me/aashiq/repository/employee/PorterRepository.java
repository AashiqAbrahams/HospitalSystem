package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Porter;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface PorterRepository extends Repository<Porter, String> {

    Set<Porter> getAll();

}
