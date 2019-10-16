package me.aashiq.factory.visit;

import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.domain.visit.Medication;
import me.aashiq.domain.visit.Prescription;
import me.aashiq.domain.visit.Visit;
import me.aashiq.factory.employee.DoctorFactory;
import me.aashiq.factory.patient.InPatientFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class PrescriptionFactoryTest {

    @Test
    public void buildPrescription() {


        //creating a visit
        Doctor doctor = DoctorFactory.getDoctor( "Mohammed", "Khan", "1234564", "1 May 2501", "Renal Doctor", "Super Man");

        Patient aPatient = InPatientFactory.getInPatient("Mohammed", "Khan", "123135", "3213213213", 23, "1231", "1", 123, "111111");

        Visit visit = VisitFactory.getVisit(new Date().toString(), aPatient.getPatientId().toString(), doctor.getEmployeeId(), "fasd", "fasd");

        Medication medication = MedicationFactory.getMedication("Panado", "Pain Killer", 2);

        Prescription prescription = PrescriptionFactory.buildPrescription(medication.getMedicationId(), visit.getVisitId());
        System.out.println(prescription);
        Assert.assertNotNull(prescription);

    }
}
