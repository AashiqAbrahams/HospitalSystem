package me.aashiq.service.hospital.impl;

import me.aashiq.domain.hospital.Department;
import me.aashiq.repository.hospital.hibernate.DepartmentRepositoryHibernate;
import me.aashiq.service.hospital.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentServiceImpl service = null;
    @Autowired
    private DepartmentRepositoryHibernate repository;

    public DepartmentServiceImpl() {

    }

    public DepartmentServiceImpl getService(){

        if(service == null){
            return new DepartmentServiceImpl();
        }
        return service;
    }


    @Override
    public Set<Department> getAll() {
        List<Department> list = (List<Department>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Department create(Department department) {
        return repository.save(department);
    }

    @Override
    public Department read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Department update(Department department) {
        return repository.save(department);
    }

    @Override
    public void delete(String integer) {
        repository.deleteById(integer);
    }



}
