package me.aashiq.factory.patient;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.factory.employee.DoctorFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientFactoryTest {

    @Test
    public void getInPatient() {


        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        System.out.println(aPatient);

        Assert.assertNotNull(aPatient);

    }
}