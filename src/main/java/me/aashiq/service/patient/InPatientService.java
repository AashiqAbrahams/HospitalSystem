package me.aashiq.service.patient;

import me.aashiq.domain.patient.InPatient;
import me.aashiq.service.Service;

import java.util.Set;

public interface InPatientService extends Service<InPatient, String> {

    Set<InPatient> getAll();

}
