package me.aashiq.repository.patient.impl;

import me.aashiq.domain.patient.Patient;
import me.aashiq.repository.patient.OutPatientRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("OutPatientInMemory")
public class OutPatientRepositoryImpl implements OutPatientRepository {

    private static OutPatientRepositoryImpl repository = null;
    private Set<Patient> patients;

    public OutPatientRepositoryImpl(){
        patients = new HashSet<>();
    }

    public static OutPatientRepositoryImpl getRepository(){
        if(repository == null){
            repository = new OutPatientRepositoryImpl();
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
