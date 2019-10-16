package me.aashiq.service.patient.impl;

import me.aashiq.domain.patient.Report;
import me.aashiq.repository.patient.hibernate.ReportRepositoryHibernate;
import me.aashiq.service.patient.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ReportServiceImpl implements ReportService {

    private ReportServiceImpl service = null;

    @Autowired
    @Qualifier("InDB")
    private ReportRepositoryHibernate repository;

    public ReportServiceImpl getService(){

        if(service == null){
            return new ReportServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Report> getAll() {

        List<Report> reportList = (List<Report>) repository.findAll();

        return new HashSet<>(reportList);

    }

    @Override
    public Report create(Report report) {
        return repository.save(report);
    }

    @Override
    public Report read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Report update(Report report) {
        return repository.save(report);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);
    }
}
