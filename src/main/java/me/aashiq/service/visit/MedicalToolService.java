package me.aashiq.service.visit;

import me.aashiq.domain.visit.MedicalTool;
import me.aashiq.service.Service;

import java.util.Set;

public interface MedicalToolService extends Service<MedicalTool, String> {

    Set<MedicalTool> getAll();

}
