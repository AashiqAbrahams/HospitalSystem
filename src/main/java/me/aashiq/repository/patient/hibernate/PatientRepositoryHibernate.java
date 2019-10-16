package me.aashiq.repository.patient.hibernate;

import me.aashiq.domain.patient.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepositoryHibernate extends CrudRepository<Patient, String> {


}

