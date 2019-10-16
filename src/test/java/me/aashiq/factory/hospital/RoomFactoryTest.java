package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Room;
import org.junit.Assert;
import org.junit.Test;

public class RoomFactoryTest {

    @Test
    public void getRoom() {

        Room room = RoomFactory.getRoom("A");
        System.out.println(room);

        Assert.assertNotNull(room.getRoomId());

    }
}