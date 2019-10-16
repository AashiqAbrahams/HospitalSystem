package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Hospital;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface HospitalRepository extends Repository<Hospital, String> {


    Set<Hospital> getAll();

}
