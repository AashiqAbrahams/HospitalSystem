package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Ward;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface WardRepository extends Repository<Ward, String> {


    Set<Ward> getAll();
}
