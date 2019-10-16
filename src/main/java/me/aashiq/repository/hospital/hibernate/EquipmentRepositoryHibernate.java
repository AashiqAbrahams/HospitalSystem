package me.aashiq.repository.hospital.hibernate;

import me.aashiq.domain.hospital.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepositoryHibernate extends CrudRepository<Equipment, String> {



}
