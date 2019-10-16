package me.aashiq.repository.hospital.hibernate;


import me.aashiq.domain.hospital.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryHibernate extends CrudRepository<Department, String> {



}
