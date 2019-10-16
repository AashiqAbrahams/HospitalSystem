package me.aashiq.controller.patient;

import me.aashiq.domain.patient.InPatient;
import me.aashiq.service.patient.OutPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/outpatient")
public class OutPatientController {
    @Autowired
    private OutPatientService inPatientService;

    @PostMapping
    public InPatient create(@RequestBody InPatient t){
        return t;
    }

    @GetMapping(path = "/find/{id}")
    public InPatient findById(@PathVariable String id){
        return null;
    }

    @PutMapping("/update")
    public InPatient update(@RequestBody InPatient t){
        return null;
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){


    }

    @GetMapping("/getAll")
    public Set<InPatient> getAll(){
        return null;
    }

}
