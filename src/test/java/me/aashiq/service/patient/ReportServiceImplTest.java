package me.aashiq.service.patient;

import me.aashiq.domain.patient.Report;
import me.aashiq.factory.patient.ReportFactory;
import org.junit.Test;
import me.aashiq.service.patient.impl.ReportServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceImplTest {

    @Autowired
    private ReportServiceImpl reportService;


    @Test
    public void create() {

        Report report = ReportFactory.getReport("fas", null, null, null);
        reportService.create(report);
        assertNotNull(reportService.getAll());

    }

    @Test
    public void read() {

        Report report = ReportFactory.getReport("fas", null, null, null);
        reportService.create(report);
        assertNotNull(reportService.getAll());

        Report fromSet = reportService.read(report.getReportId());

        assertNull(fromSet);


    }

    @Test
    public void update() {


        Report report = ReportFactory.getReport("fas", null, null, null);
        reportService.create(report);
        assertNotNull(reportService.getAll());

        Report update = ReportFactory.getReport("fadass", null, null, null);
        update.setReportId(report.getReportId());
        reportService.update(update);

        Report updated = reportService.read(report.getReportId());

        assertNotEquals(update, updated);

    }

    @Test
    public void delete() {


        Report report = ReportFactory.getReport("fas", null, null, null);
        reportService.create(report);
        assertNotNull(reportService.getAll());

        reportService.delete(report.getReportId());

        Report report1 = reportService.read(report.getReportId());

        assertNull(report1);


    }
}