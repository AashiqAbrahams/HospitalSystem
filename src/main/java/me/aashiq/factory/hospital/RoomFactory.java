package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Room;
import me.aashiq.helper.IDGenerator;

public class RoomFactory {

    public static Room getRoom(String equipment) {
        return new Room.RoomBuilder()
                .roomId(IDGenerator.generateId())
                .equipment(equipment)
                .build();
    }




}
