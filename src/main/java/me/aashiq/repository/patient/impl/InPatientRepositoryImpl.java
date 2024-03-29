package me.aashiq.repository.patient.impl;

import me.aashiq.domain.patient.Patient;
import me.aashiq.repository.patient.InPatientRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("InPatientInMemory")
public class InPatientRepositoryImpl implements InPatientRepository {

    private static InPatientRepositoryImpl repository = null;
    private Set<Patient> patients;

    public InPatientRepositoryImpl(){
        patients = new HashSet<>();
    }

    public static InPatientRepositoryImpl getRepository(){
        if(repository == null){
            repository = new InPatientRepositoryImpl();
        }

        return repository;
    }

    @Override
    public Patient create(Patient patient) {
        patients.add(patient);
        return patient;
    }

    @Override
    public Patient update(Patient patient) {

        Patient inDB = read(patient.getPatientId().toString());

        if(inDB != null){
            patients.remove(inDB);
            patients.add(patient);
            return patient;
        }

        return null;
    }

    @Override
    public void delete(String id) {
        Patient inDB = read(id);
        patients.remove(inDB);
    }

    @Override
    public Patient read(String id) {

        return patients.stream().filter(patient -> patient.getPatientId().equals(id)).findAny().orElse(null);

    }

    @Override
    public Set<Patient> getAll() {
        return patients;
    }

}
