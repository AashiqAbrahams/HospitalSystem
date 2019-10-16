package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Nurse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepositoryHibernate extends CrudRepository<Nurse, String> {


}
