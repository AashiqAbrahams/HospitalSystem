package me.aashiq.repository.appointment.hibernate;

import me.aashiq.domain.appoinment.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepositoryHibernate extends CrudRepository<Appointment, String> {


}
