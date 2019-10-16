package me.aashiq.controller.hospital;

import me.aashiq.domain.hospital.Hospital;
import me.aashiq.service.hospital.impl.HospitalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "http://localhost:4200")
public class HospitalController {


    @Autowired
    private HospitalServiceImpl hospitalService;

    @PostMapping("/new")
    public Hospital create(@RequestBody Hospital t){
        return hospitalService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Hospital findById(@PathVariable String id){
        return hospitalService.read(id);
    }

    @PutMapping("/update")
    public Hospital update(@RequestBody Hospital t){
        return hospitalService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){


        hospitalService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Hospital> getAll(){
        return hospitalService.getAll();
    }



}
