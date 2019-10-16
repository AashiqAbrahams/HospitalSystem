package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Pharmacist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacistRepositoryHibernate extends CrudRepository<Pharmacist, String> {

}
