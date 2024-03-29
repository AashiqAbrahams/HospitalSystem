package me.aashiq.controller.patient;

import me.aashiq.domain.patient.Report;
import me.aashiq.service.patient.impl.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportServiceImpl reportService;

    @PostMapping("/new")
    public Report create(@RequestBody Report t){
        return reportService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Report findById(@PathVariable String id){
        return reportService.read(id);
    }

    @PutMapping("/update")
    public Report update(@RequestBody Report t){
        return reportService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        reportService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Report> getAll(){
        return reportService.getAll();
    }

}
