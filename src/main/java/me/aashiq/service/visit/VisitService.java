package me.aashiq.service.visit;

import me.aashiq.domain.visit.Visit;
import me.aashiq.service.Service;

import java.util.Set;

public interface VisitService extends Service<Visit, String> {

    Set<Visit> getAll();

}
