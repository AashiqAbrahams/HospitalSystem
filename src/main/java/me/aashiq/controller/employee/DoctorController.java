package me.aashiq.controller.employee;

import me.aashiq.domain.employee.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.aashiq.service.employee.impl.DoctorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    @PostMapping("/new")
    public Doctor create(@RequestBody Doctor doc){

        return doctorService.create(doc);
    }

    @GetMapping(path = "/find/{id}")
    public Doctor findById(@PathVariable String id){

        return doctorService.read(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Doctor doc){

        doctorService.update(doc);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        doctorService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Doctor> getAll(){
        return doctorService.getAll();
    }


}
