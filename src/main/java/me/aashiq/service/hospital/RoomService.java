package me.aashiq.service.hospital;

import me.aashiq.domain.hospital.Room;
import me.aashiq.service.Service;

import java.util.Set;

public interface RoomService extends Service<Room, String> {

    Set<Room> getAll();

}
