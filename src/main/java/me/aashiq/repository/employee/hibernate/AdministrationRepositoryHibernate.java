package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Administration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationRepositoryHibernate extends CrudRepository<Administration, String> {


}
