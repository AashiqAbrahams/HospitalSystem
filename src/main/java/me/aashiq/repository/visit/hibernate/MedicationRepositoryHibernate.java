package me.aashiq.repository.visit.hibernate;

import me.aashiq.domain.visit.Medication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepositoryHibernate extends CrudRepository<Medication, String> {

}

