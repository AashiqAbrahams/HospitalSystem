package me.aashiq.repository.visit;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.domain.visit.Visit;
import me.aashiq.factory.employee.DoctorFactory;
import me.aashiq.factory.patient.InPatientFactory;
import me.aashiq.factory.visit.VisitFactory;
import org.junit.Test;
import me.aashiq.repository.visit.impl.VisitRepositoryImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitRepositoryTest {

    @Autowired
    private VisitRepositoryImpl visitRepository;

    @Test
    public void create() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitRepository.create(visit);

        assertNotNull(visitRepository.getAll());

    }

    @Test
    public void read() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitRepository.create(visit);

        assertNotNull(visitRepository.getAll());

        Visit visit1 = visitRepository.read(visit.getVisitId());

        assertEquals(visit, visit1);

    }

    @Test
    public void update() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitRepository.create(visit);

        assertNotNull(visitRepository.getAll());

        Visit visitUpdate =  VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");
        visitUpdate.setVisitId(visit.getVisitId());
        visitRepository.update(visitUpdate);

        Visit updated = visitRepository.read(visitUpdate.getVisitId());

        assertEquals(visitUpdate, updated);

    }

    @Test
    public void delete() {

        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        visitRepository.create(visit);

        assertNotNull(visitRepository.getAll());

        visitRepository.delete(visit.getVisitId());

        Visit notThere = visitRepository.read(visit.getVisitId());

        assertNull(notThere);

    }
}
