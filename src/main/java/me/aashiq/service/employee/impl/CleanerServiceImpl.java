package me.aashiq.service.employee.impl;

import me.aashiq.domain.employee.Cleaner;
import me.aashiq.repository.employee.hibernate.CleanerRepositoryHibernate;
import me.aashiq.service.employee.CleanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service("CleanerServiceImpl")
public class CleanerServiceImpl implements CleanerService {

    private CleanerServiceImpl service = null;
    @Autowired
    private CleanerRepositoryHibernate repository;

    public CleanerServiceImpl(){
    }

    public CleanerServiceImpl getService(){
        if (service == null){
            service = new CleanerServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Cleaner> getAll() {
        List<Cleaner> list = (List<Cleaner>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Cleaner create(Cleaner cleaner) {
        return repository.save(cleaner);
    }

    @Override
    public Cleaner read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {
        return repository.save(cleaner);
    }

    @Override
    public void delete(String integer) {
        repository.deleteById(integer);
    }



}
