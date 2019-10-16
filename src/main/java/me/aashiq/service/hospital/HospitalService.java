package me.aashiq.service.hospital;

import me.aashiq.domain.hospital.Hospital;
import me.aashiq.service.Service;

import java.util.Set;

public interface HospitalService extends Service<Hospital, String> {
    Set<Hospital> getAll();
}
