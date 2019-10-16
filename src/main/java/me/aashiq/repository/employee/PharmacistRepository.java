package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface PharmacistRepository extends Repository<Pharmacist, String> {

    Set<Pharmacist> getAll();
}
