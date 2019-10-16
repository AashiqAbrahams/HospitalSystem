package me.aashiq.service.visit;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.domain.visit.Visit;
import me.aashiq.factory.employee.DoctorFactory;
import me.aashiq.factory.patient.InPatientFactory;
import me.aashiq.factory.visit.VisitFactory;
import me.aashiq.service.appointment.AppointmentService;
import me.aashiq.service.employee.DoctorService;
import me.aashiq.service.patient.PatientService;
import org.junit.Test;
import me.aashiq.service.visit.impl.VisitServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitServiceImplTest {

    @Autowired
    private VisitServiceImpl visitService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private AppointmentService appointmentService;


    @Test
    public void create() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitService.create(visit);

        assertNotNull(visitService.getAll());

    }

    @Test
    public void read() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");
        visitService.create(visit);

        assertNotNull(visitService.getAll());

        Visit visit1 = visitService.read(visit.getVisitId());

        assertEquals(visit, visit1);

    }

    @Test
    public void update() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitService.create(visit);

        assertNotNull(visitService.getAll());

        Visit visitUpdate = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");
        visitUpdate.setVisitId(visit.getVisitId());
        visitService.update(visitUpdate);

        Visit updated = visitService.read(visitUpdate.getVisitId());

        assertEquals(visitUpdate, updated);

    }

    @Test
    public void delete() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitService.create(visit);

        assertNotNull(visitService.getAll());

        visitService.delete(visit.getVisitId());

        Visit notThere = visitService.read(visit.getVisitId());

        assertNull(notThere);

    }

    @Test
    public void createVisit(){

//        Patient patient = InPatientFactory.getInPatient("Mohammed", "Khan", "0762828630", "1", 1, "ME");
//        patientService.create(patient);
//
//        Doctor doctor = DoctorFactory.getDoctor("Riaz", "Khan", "Renal");
//        doctorService.create(doctor);
//
//        Appointment appointment = AppointmentFactory.getAppointment("Today", patient.getPatientId());
//        appointmentService.create(appointment);
//
//        Visit visit = visitService.createVisit(patient.getPatientId(), doctor.getEmployeeId(), appointment.getAppointmentId());
//        assertNotNull(visit);


    }

}
