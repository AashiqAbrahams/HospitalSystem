package me.aashiq.service.hospital.impl;

import me.aashiq.domain.hospital.Room;
import me.aashiq.repository.hospital.hibernate.RoomRepositoryHibernate;
import me.aashiq.service.hospital.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class RoomServiceImpl implements RoomService {


    private RoomServiceImpl service = null;
    @Autowired
    private RoomRepositoryHibernate repository;

    public RoomServiceImpl() {

    }

    public RoomServiceImpl getService(){

        if(service == null){
            return new RoomServiceImpl();
        }
        return service;
    }


    @Override
    public Set<Room> getAll() {
        List<Room> list = (List<Room>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Room create(Room room) {
        return repository.save(room);
    }

    @Override
    public Room read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Room update(Room room) {
        return repository.save(room);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);
    }
}
