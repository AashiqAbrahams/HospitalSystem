package me.aashiq.repository.patient;

import me.aashiq.domain.patient.Patient;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface InPatientRepository extends Repository<Patient, String> {


    Set<Patient> getAll();
}
