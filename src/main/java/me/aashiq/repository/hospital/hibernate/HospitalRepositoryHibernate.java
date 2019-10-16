package me.aashiq.repository.hospital.hibernate;

import me.aashiq.domain.hospital.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepositoryHibernate extends CrudRepository<Hospital, String> {

}
