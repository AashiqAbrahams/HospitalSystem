package me.aashiq.factory.visit;

import me.aashiq.domain.visit.Visit;
import me.aashiq.helper.IDGenerator;

public class VisitFactory {

    public static Visit getVisit(String visitDate, String patientId, String doctorId, String duration, String patientNote) {
        return  new Visit(IDGenerator.generateId(), visitDate, patientId, doctorId, duration, patientNote);
    }




}
