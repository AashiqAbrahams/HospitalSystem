package me.aashiq.service.hospital;

import me.aashiq.domain.hospital.Ward;
import me.aashiq.service.Service;

import java.util.Set;

public interface WardService extends Service<Ward, String> {

    Set<Ward> getAll();

}
