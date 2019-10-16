package me.aashiq.repository.hospital.hibernate;

import me.aashiq.domain.hospital.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepositoryHibernate extends CrudRepository<Room, String> {



}
