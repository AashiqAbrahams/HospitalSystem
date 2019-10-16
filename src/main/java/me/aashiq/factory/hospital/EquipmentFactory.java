package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Equipment;
import me.aashiq.helper.IDGenerator;


public class EquipmentFactory {

    public static Equipment getEquipment(String name, String desc, int quantity) {
        return new Equipment.EquipmentBuilder()
                .equipmentId(IDGenerator.generateId())
                .name(name)
                .desc(desc)
                .quantity(quantity)
                .build();
    }

}
