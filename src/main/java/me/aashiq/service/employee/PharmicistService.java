package me.aashiq.service.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.service.Service;

import java.util.Set;

public interface PharmicistService extends Service<Pharmacist, String> {
    Set<Pharmacist> getAll();
}
