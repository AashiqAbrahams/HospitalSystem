package me.aashiq.service.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.factory.employee.PharmacistFactory;
import org.junit.Test;
import me.aashiq.service.employee.impl.PharmacistServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PharmacistServiceImplTest {

    @Autowired
    private PharmacistServiceImpl pharmacistService;


    @Test
    public void create() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistService.create(pharmacist);

        assertNotNull(pharmacistService.getAll());

    }

    @Test
    public void read() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistService.create(pharmacist);

        assertNotNull(pharmacistService.getAll());

        Pharmacist fromSet = pharmacistService.read(pharmacist.getEmployeeId());

        assertEquals(pharmacist, fromSet);



    }

    @Test
    public void update() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistService.create(pharmacist);

        assertNotNull(pharmacistService.getAll());

        Pharmacist update = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");
        update.setEmployeeId(pharmacist.getEmployeeId());
        pharmacistService.update(update);

        Pharmacist updated = pharmacistService.read(update.getEmployeeId());

        assertEquals(update, updated);

    }

    @Test
    public void delete() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistService.create(pharmacist);

        assertNotNull(pharmacistService.getAll());

        pharmacistService.delete(pharmacist.getEmployeeId());

        Pharmacist notThere = pharmacistService.read(pharmacist.getEmployeeId());

        assertNull(notThere);


    }
}