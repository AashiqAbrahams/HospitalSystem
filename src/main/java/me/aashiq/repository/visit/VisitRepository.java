package me.aashiq.repository.visit;

import me.aashiq.domain.visit.Visit;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface VisitRepository extends Repository<Visit, String> {


    Set<Visit> getAll();


}
