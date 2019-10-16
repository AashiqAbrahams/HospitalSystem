package me.aashiq.repository.patient;

import me.aashiq.domain.patient.Account;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface AccountRepository extends Repository<Account, String> {


    Set<Account> getAll();

}
