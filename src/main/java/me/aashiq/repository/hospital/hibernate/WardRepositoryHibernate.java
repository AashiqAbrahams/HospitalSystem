package me.aashiq.repository.hospital.hibernate;

import me.aashiq.domain.hospital.Ward;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepositoryHibernate extends CrudRepository<Ward, String> {
}
