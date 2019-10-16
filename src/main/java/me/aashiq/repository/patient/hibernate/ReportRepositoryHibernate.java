package me.aashiq.repository.patient.hibernate;

import me.aashiq.domain.patient.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("InDB")
public interface ReportRepositoryHibernate extends CrudRepository<Report, String> {



}
