package me.aashiq.repository.employee;

import me.aashiq.domain.employee.Administration;
import me.aashiq.factory.employee.AdministrationFactory;
import org.junit.Test;
import me.aashiq.repository.employee.impl.AdministrationRepositoryImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdministrationRepositoryTest {

    @Autowired
    private AdministrationRepositoryImpl administrationRepository;

    @Test
    public void create() {

        Administration admin = AdministrationFactory.getAdministration( "Riaz", "Khan", "1234567", "8 July 2019", "receptionist", "Super Access");
        administrationRepository.create(admin);

        assertNotNull(administrationRepository.getAll());

    }

    @Test
    public void read() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration( "Riaz", "Khan", "1234567", "8 July 2019", "receptionist", "Super Access");
        administrationRepository.create(admin);

        //retrieve the adminStaff
        Administration adminInSet = administrationRepository.read(admin.getEmployeeId());

        assertEquals(admin, adminInSet);

    }

    @Test
    public void update() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration( "Riaz", "Khan", "1234567", "8 July 2019", "receptionist", "Super Access");
        administrationRepository.create(admin);

        //updated version
        Administration adminUpdate = AdministrationFactory.getAdministration("Riaz", "Khan", "1234567", "8 July 2019", "receptionist", "Suoer");
        adminUpdate.setEmployeeId(admin.getEmployeeId());
        administrationRepository.update(adminUpdate);

        //get the updated version
        Administration updatedVersion = administrationRepository.read(adminUpdate.getEmployeeId());

        assertEquals(adminUpdate, updatedVersion);

    }

    @Test
    public void delete() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration( "Riaz", "Khan", "1234567", "8 July 2019", "receptionist", "Super Access");
        administrationRepository.create(admin);

        //checks that its not empty
        assertNotNull(administrationRepository.getAll());

        administrationRepository.delete(admin.getEmployeeId());

        //check if its deleted
        Administration updatedVersion = administrationRepository.read(admin.getEmployeeId());

        assertNull(updatedVersion);//will pass if its not there

    }
}