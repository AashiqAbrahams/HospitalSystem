package me.aashiq.service.visit;

import me.aashiq.domain.visit.Medication;
import me.aashiq.service.Service;

import java.util.Set;

public interface MedicationService extends Service<Medication, String> {

    Set<Medication> getAll();

}
