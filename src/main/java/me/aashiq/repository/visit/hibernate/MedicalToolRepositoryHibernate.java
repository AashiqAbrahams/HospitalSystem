package me.aashiq.repository.visit.hibernate;

import me.aashiq.domain.visit.MedicalTool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalToolRepositoryHibernate extends CrudRepository<MedicalTool, String> {

}
