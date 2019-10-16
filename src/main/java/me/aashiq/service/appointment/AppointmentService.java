package me.aashiq.service.appointment;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.service.Service;

import java.util.Set;

public interface AppointmentService extends Service<Appointment, String> {

    Set<Appointment> getAll();

}
