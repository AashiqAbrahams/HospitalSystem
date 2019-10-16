package me.aashiq.repository.patient.hibernate;

import me.aashiq.domain.patient.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositoryHibernate extends CrudRepository<Account, String> {


}
