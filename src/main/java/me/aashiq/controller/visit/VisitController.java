package me.aashiq.controller.visit;

import me.aashiq.domain.visit.Visit;
import me.aashiq.service.visit.impl.VisitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/visit")
@CrossOrigin(origins = "http://localhost:4200")
public class VisitController {

    @Autowired
    private VisitServiceImpl visitService;

    @PostMapping("/new")
    public Visit create(@RequestBody Visit t){
        return visitService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Visit findById(@PathVariable String id){
        return visitService.read(id);
    }

    @PutMapping("/update")
    public Visit update(@RequestBody Visit t){
        return visitService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        visitService.delete(id);

    }

    @GetMapping("/getall")
    public Set<Visit> getAll(){
        return visitService.getAll();
    }

}
