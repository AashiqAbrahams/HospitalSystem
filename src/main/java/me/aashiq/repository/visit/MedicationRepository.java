package me.aashiq.repository.visit;

import me.aashiq.domain.visit.Medication;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface MedicationRepository extends Repository<Medication, String>{


    Set<Medication> getAll();

}

