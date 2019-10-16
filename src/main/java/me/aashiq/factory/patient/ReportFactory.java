package me.aashiq.factory.patient;

import me.aashiq.domain.patient.Report;
import me.aashiq.helper.IDGenerator;

public class ReportFactory {

    public static Report getReport(String title, String description, String dateRange, String patient) {
        return new Report.ReportBuilder()
                .reportId(IDGenerator.generateId())
                .title(title)
                .description(description)
                .dateRange(dateRange)
                .patient(patient)
                .build();
    }

}
