package me.aashiq.factory.appointment;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.helper.IDGenerator;


public class AppointmentFactory {

    public static Appointment getAppointment(String bookingDate, String patientId) {
        return new Appointment.AppointmentBuilder()
                .appointmentId(IDGenerator.generateId())
                .bookingDate(bookingDate)
                .patientId(patientId)
                .build();
    }



}
