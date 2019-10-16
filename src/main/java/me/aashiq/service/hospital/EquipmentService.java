package me.aashiq.service.hospital;

import me.aashiq.domain.hospital.Equipment;
import me.aashiq.service.Service;

import java.util.Set;

public interface EquipmentService extends Service<Equipment, String> {

    Set<Equipment> getAll();
}
