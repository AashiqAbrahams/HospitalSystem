package me.aashiq.factory.visit;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.domain.visit.Visit;
import me.aashiq.factory.employee.DoctorFactory;
import me.aashiq.factory.patient.InPatientFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class VisitFactoryTest {

    @Test
    public void getVisit() {


        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        System.out.println(visit);

        Assert.assertNotNull(visit);

    }
}
