package me.aashiq.service.hospital.impl;

import me.aashiq.domain.hospital.Ward;
import me.aashiq.repository.hospital.hibernate.WardRepositoryHibernate;
import me.aashiq.service.hospital.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class WardServiceImpl implements WardService {

    private WardServiceImpl service = null;
    @Autowired
    private WardRepositoryHibernate repository;

    public WardServiceImpl() {
    }

    public WardServiceImpl getService(){

        if(service == null){
            return new WardServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Ward> getAll() {
        List<Ward> list = (List<Ward>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Ward create(Ward ward) {
        return repository.save(ward);
    }

    @Override
    public Ward read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Ward update(Ward ward) {
        return repository.save(ward);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);
    }
}
