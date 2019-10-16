package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Equipment;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface EquipmentRepository extends Repository<Equipment, String> {

    Set<Equipment> getAll();


}
