package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Department;
import me.aashiq.domain.hospital.Hospital;
import me.aashiq.factory.hospital.HospitalFactory;
import org.junit.Test;
import me.aashiq.repository.hospital.impl.HospitalRepositoryImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalRepositoryTest {

    @Autowired
    private HospitalRepositoryImpl hospitalRepository;

    @Test
    public void create() {

        List<Department> departmentList = new ArrayList<>();

        //Hospital
        Hospital hosp = HospitalFactory.getHospital("Greys Anamtomy", "Deparment 1");

        hospitalRepository.create(hosp);

        assertNotNull(hospitalRepository.getAll());

    }

    @Test
    public void read() {

        List<Department> departmentList = new ArrayList<>();

        //Hospital
        Hospital hospital = HospitalFactory.getHospital("Greys Anamtomy", "Deparment 1");

        hospitalRepository.create(hospital);

        assertNotNull(hospitalRepository.getAll());

        Hospital fromSet = hospitalRepository.read(hospital.getHospitalId());

        assertEquals(hospital.getHospitalId(), fromSet.getHospitalId());


    }

    @Test
    public void update() {

        List<Department> departmentList = new ArrayList<>();

        //Hospital
        Hospital hospital = HospitalFactory.getHospital("Greys Anamtomy", "Deparment 1");

        hospitalRepository.create(hospital);

        assertNotNull(hospitalRepository.getAll());

        Hospital hospitalUpdate = new Hospital.HospitalBuilder().copy(hospital).hospitalName("Grooteschuur").build();

        hospitalRepository.update(hospitalUpdate);

        Hospital updated = hospitalRepository.read(hospitalUpdate.getHospitalId());

        assertNotNull(updated.getHospitalName());

    }

    @Test
    public void delete() {

        List<Department> departmentList = new ArrayList<>();

        //Hospital
        Hospital hospital = HospitalFactory.getHospital("Greys Anamtomy", "Deparment 1");


        hospitalRepository.create(hospital);

        assertNotNull(hospitalRepository.getAll());

        hospitalRepository.delete(hospital.getHospitalId());

        Hospital notThere = hospitalRepository.read(hospital.getHospitalId());

        assertNull(notThere);



    }
}