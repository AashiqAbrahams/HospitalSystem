package me.aashiq.repository.appointment;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface AppointmentRepository extends Repository<Appointment, String> {

    Set<Appointment> getAll();

}
