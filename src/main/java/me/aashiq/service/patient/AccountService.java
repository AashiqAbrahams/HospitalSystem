package me.aashiq.service.patient;

import me.aashiq.domain.patient.Account;
import me.aashiq.service.Service;

import java.util.Set;

public interface AccountService extends Service<Account, String> {

    Set<Account> getAll();
}
