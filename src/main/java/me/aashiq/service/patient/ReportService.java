package me.aashiq.service.patient;

import me.aashiq.domain.patient.Report;
import me.aashiq.service.Service;

import java.util.Set;

public interface ReportService extends Service<Report, String> {

    Set<Report> getAll();

}
