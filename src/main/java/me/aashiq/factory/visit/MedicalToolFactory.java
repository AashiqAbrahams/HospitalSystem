package me.aashiq.factory.visit;

import me.aashiq.domain.visit.MedicalTool;
import me.aashiq.helper.IDGenerator;

public class MedicalToolFactory {

    public static MedicalTool getMedicalTool(String toolName, String toolCost) {
        return new MedicalTool.MedicalToolBuilder()
                .toolId(IDGenerator.generateId())
                .toolName(toolName)
                .toolCost(toolCost)
                .build();
    }

}
