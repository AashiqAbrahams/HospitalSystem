package me.aashiq.service.visit.impl;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.domain.employee.Doctor;
import me.aashiq.domain.patient.Patient;
import me.aashiq.domain.visit.Visit;
import me.aashiq.factory.visit.VisitFactory;
import me.aashiq.repository.appointment.hibernate.AppointmentRepositoryHibernate;
import me.aashiq.repository.employee.hibernate.DoctorRepositoryHibernate;
import me.aashiq.repository.patient.hibernate.PatientRepositoryHibernate;
import me.aashiq.repository.visit.hibernate.VisitRepositoryHibernate;
import me.aashiq.service.visit.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class VisitServiceImpl implements VisitService {

    private VisitServiceImpl service = null;
    @Autowired
    private VisitRepositoryHibernate repository;
    @Autowired
    private AppointmentRepositoryHibernate appointmentRepository;
    @Autowired
    private DoctorRepositoryHibernate doctorRepository;
    @Autowired
    private PatientRepositoryHibernate patientRepository;

    public VisitServiceImpl() {

    }

    public VisitServiceImpl getService(){

        if(service == null){
            return new VisitServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Visit> getAll() {
        List<Visit> list = (List<Visit>) repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Visit create(Visit visit) {
        return repository.save(visit);
    }

    @Override
    public Visit read(String integer) {
        return repository.findById(integer).orElse(null);
    }

    @Override
    public Visit update(Visit visit) {
        return repository.save(visit);
    }

    @Override
    public void delete(String integer) {

        repository.deleteById(integer);
    }

    public Visit createVisit(String patientId, String doctorId, String appointmentId){

        Patient patient = patientRepository.findById(patientId).orElse(null);
        Doctor doctor = doctorRepository.findById(doctorId).orElse(null);
        Appointment appointment = appointmentRepository.findById(appointmentId).orElse(null);

        System.out.println(patient);
        System.out.println(doctor);
        System.out.println(appointment);

        if(patient.getPatientId() != null && doctor.getEmployeeId() != null && appointment.getAppointmentId() != null){

            Visit visit = VisitFactory.getVisit(new Date().toString(), patient.getPatientId().toString(), doctor.getEmployeeId(), "1 hr", "Tired");

            return create(visit);
        }

        return null;


    }

}
