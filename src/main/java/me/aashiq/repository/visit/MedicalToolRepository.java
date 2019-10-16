package me.aashiq.repository.visit;

import me.aashiq.domain.visit.MedicalTool;
import me.aashiq.repository.Repository;

import java.util.Set;

public interface MedicalToolRepository extends Repository<MedicalTool, String> {


    Set<MedicalTool> getAll();

}
