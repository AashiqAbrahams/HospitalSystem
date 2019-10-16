package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Room;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface RoomRepository extends Repository<Room, String> {


    Set<Room> getAll();


}
