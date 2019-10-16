package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.factory.employee.PharmacistFactory;
import org.junit.Test;
import me.aashiq.repository.employee.impl.PharmacistRepositoryImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PharmacistRepositoryTest {

    @Autowired
    private PharmacistRepositoryImpl pharmacistRepository;


    @Test
    public void create() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistRepository.create(pharmacist);

        assertNotNull(pharmacistRepository.getAll());

    }

    @Test
    public void read() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistRepository.create(pharmacist);

        assertNotNull(pharmacistRepository.getAll());

        Pharmacist fromSet = pharmacistRepository.read(pharmacist.getEmployeeId());

        assertEquals(pharmacist, fromSet);



    }

    @Test
    public void update() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistRepository.create(pharmacist);

        assertNotNull(pharmacistRepository.getAll());

        Pharmacist update = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");;
        update.setEmployeeId(pharmacist.getEmployeeId());
        pharmacistRepository.update(update);

        Pharmacist updated = pharmacistRepository.read(update.getEmployeeId());

        assertEquals(update, updated);

    }

    @Test
    public void delete() {

        int[] meds = {1,1,1,1};
        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "Riaz", "Khan", "1234564", "1 May 2501", "Renal Doctor", "No Expiration");

        pharmacistRepository.create(pharmacist);

        assertNotNull(pharmacistRepository.getAll());

        pharmacistRepository.delete(pharmacist.getEmployeeId());

        Pharmacist notThere = pharmacistRepository.read(pharmacist.getEmployeeId());

        assertNull(notThere);


    }
}