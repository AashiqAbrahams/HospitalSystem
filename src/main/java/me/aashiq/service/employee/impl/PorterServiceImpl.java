package me.aashiq.service.employee.impl;

import me.aashiq.domain.employee.Porter;
import me.aashiq.repository.employee.hibernate.PorterRepositoryHibernate;
import me.aashiq.service.employee.PorterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class PorterServiceImpl implements PorterService {

    private PorterServiceImpl service = null;
    @Autowired
    private PorterRepositoryHibernate repository;

    public PorterServiceImpl() {
    }

    public PorterServiceImpl getService(){

        if(service == null){
            return new PorterServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Porter> getAll() {
        List<Porter> list = (List<Porter>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Porter create(Porter porter) {
        return repository.save(porter);
    }

    @Override
    public Porter read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Porter update(Porter porter) {
        return repository.save(porter);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);

    }
}
