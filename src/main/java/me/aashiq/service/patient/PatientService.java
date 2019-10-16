package me.aashiq.service.patient;

import me.aashiq.domain.patient.Patient;
import me.aashiq.service.Service;

import java.util.Set;

public interface PatientService extends Service<Patient, String> {
    Set<Patient> getAll();
}
