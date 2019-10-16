package me.aashiq.repository.employee.hibernate;

import me.aashiq.domain.employee.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepositoryHibernate extends CrudRepository<Doctor, String> {


}
