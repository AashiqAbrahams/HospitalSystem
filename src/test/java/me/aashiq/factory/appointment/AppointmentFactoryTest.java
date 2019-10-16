package me.aashiq.factory.appointment;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.domain.patient.InPatient;
import me.aashiq.factory.patient.InPatientFactory;
import org.junit.Assert;
import org.junit.Test;

public class AppointmentFactoryTest {

    @Test
    public void getAppointment() {


        InPatient patient = InPatientFactory.getInPatient("riaz", "khan", "1", "12345" ,23, "Afsd", "1234568", 2, "123");

        Appointment appointment = AppointmentFactory.getAppointment("17-04-2018", patient.getPatientId().toString());
        System.out.println(appointment);

        Assert.assertNotNull(appointment);


    }
}
