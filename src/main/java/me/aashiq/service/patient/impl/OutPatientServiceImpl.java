package me.aashiq.service.patient.impl;

import me.aashiq.domain.patient.Patient;
import me.aashiq.repository.patient.hibernate.OutPatientRepositoryHibernate;
import me.aashiq.service.patient.OutPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class OutPatientServiceImpl implements OutPatientService {

    private OutPatientServiceImpl service = null;
    @Autowired
    private OutPatientRepositoryHibernate repository;

    public OutPatientServiceImpl() {

    }

    public OutPatientServiceImpl getService(){

        if(service == null){
            return new OutPatientServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Patient> getAll() {
        List<Patient> list = (List<Patient>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Patient create(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Patient update(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);
    }
}
