package me.aashiq.service.patient;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.InPatient;
import me.aashiq.domain.patient.Patient;
import me.aashiq.factory.employee.DoctorFactory;
import me.aashiq.factory.patient.InPatientFactory;
import org.junit.Test;
import me.aashiq.service.patient.impl.InPatientServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InPatientServiceImplTest {


    @Autowired
    private InPatientServiceImpl patientService;


    @Test
    public void create() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        InPatient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        //create a patient
        patientService.create(aPatient);

        //checks if the repos set is not null
        assertNotNull(patientService.getAll());

    }

    @Test
    public void read() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        InPatient patient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        patientService.create(patient);

        //getting a patient from the set
        Patient patientFromSet = patientService.read(patient.getPatientId().toString());

        assertEquals(patient, patientFromSet);


    }

    @Test
    public void update() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        InPatient patient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        patientService.create(patient);

        Doctor doctodr = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        InPatient patientNew = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        patientNew.setPatientId(patient.getPatientId());

        //updating the value
        patientService.update(patientNew);

        //patient once updated (pulled from set)
        InPatient updatedPatientFromSet = patientService.read(patient.getPatientId().toString());

        assertEquals(patientNew, updatedPatientFromSet);

        System.out.println(patientNew.toString());
        System.out.println(updatedPatientFromSet.toString());

    }

    @Test
    public void delete() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        InPatient patient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        patientService.create(patient);

        //checks if set has a value
        assertNotNull(patientService.getAll());

        //deleting the patient
        patientService.delete(patient.getPatientId().toString());

        //checking if object is in set
        InPatient patientInSet = patientService.read(patient.getPatientId().toString());

        //if null it will pass
        assertNull(patientInSet);


    }

}
