package me.aashiq.service.employee;

import me.aashiq.domain.employee.Porter;
import me.aashiq.service.Service;

import java.util.Set;

public interface PorterService extends Service<Porter, String> {
    Set<Porter> getAll();
}
