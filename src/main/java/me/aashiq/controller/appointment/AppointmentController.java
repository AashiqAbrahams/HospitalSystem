package me.aashiq.controller.appointment;

import me.aashiq.domain.appoinment.Appointment;
import me.aashiq.service.appointment.impl.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

    @Autowired
    @Qualifier("AppointmentServiceImpl")
    private AppointmentServiceImpl appointmentService;

    @PostMapping("/new")
    public Appointment create(@RequestBody Appointment appointment){

        return appointmentService.create(appointment);
    }

    @GetMapping(path = "/find/{id}")
    public Appointment findById(@PathVariable String id){

        Appointment account = appointmentService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Appointment account){

        appointmentService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        appointmentService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Appointment> getAll(){
        return appointmentService.getAll();
    }


}
