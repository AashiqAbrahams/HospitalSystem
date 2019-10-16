package me.aashiq.repository.patient;

import me.aashiq.domain.patient.Report;

import me.aashiq.repository.Repository;

import java.util.Set;

public interface ReportRepository extends Repository<Report, String> {

   Set<Report> getAll();


}
