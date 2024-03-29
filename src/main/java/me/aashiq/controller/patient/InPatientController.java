package me.aashiq.controller.patient;

import me.aashiq.domain.patient.InPatient;
import me.aashiq.service.patient.impl.InPatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:4200")
public class InPatientController {

    @Autowired
    private InPatientServiceImpl inPatientService;

    @PostMapping("/new")
    public InPatient create(@RequestBody InPatient t) {
        return (InPatient) inPatientService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public InPatient findById(@PathVariable String id){
        return (InPatient) inPatientService.read(id);
    }

    @PutMapping("/update")
    public InPatient update(@RequestBody InPatient t){
        return inPatientService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        inPatientService.delete(id);

    }
    @GetMapping("/getall")
    public Set<InPatient> getAll(){
        return inPatientService.getAll();
    }
}
