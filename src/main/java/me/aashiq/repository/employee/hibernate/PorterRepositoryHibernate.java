package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Porter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorterRepositoryHibernate extends CrudRepository<Porter, String> {


}
