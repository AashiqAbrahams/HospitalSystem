package me.aashiq.repository.patient.hibernate;

import me.aashiq.domain.patient.InPatient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InPatientRepositoryHibernate extends CrudRepository<InPatient, String> {

}
