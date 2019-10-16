package me.aashiq.repository.visit.hibernate;

import me.aashiq.domain.visit.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepositoryHibernate extends CrudRepository<Visit, String> {



}
