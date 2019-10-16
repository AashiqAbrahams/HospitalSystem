package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Cleaner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepositoryHibernate extends CrudRepository<Cleaner, String> {



}
