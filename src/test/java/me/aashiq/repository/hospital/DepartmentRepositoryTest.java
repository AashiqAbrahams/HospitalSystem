package me.aashiq.repository.hospital;

import me.aashiq.domain.hospital.Department;
import me.aashiq.domain.hospital.Room;
import me.aashiq.domain.hospital.Ward;
import me.aashiq.factory.hospital.DepartmentFactory;
import org.junit.Test;
import me.aashiq.repository.hospital.impl.DepartmentRepositoryImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepositoryImpl departmentRepository;

    @Test
    public void create() {

        Department department = DepartmentFactory.getDepartment("Ward", "Room");
        departmentRepository.create(department);

        assertNotNull(departmentRepository.getAll());

    }

    @Test
    public void read() {


        Department department = DepartmentFactory.getDepartment("Ward", "Room");
        departmentRepository.create(department);

        assertNotNull(departmentRepository.getAll());

        Department fromSet = departmentRepository.read(department.getDepartmentId());

        assertEquals(department, fromSet);


    }

    @Test
    public void update() {

        List<Ward> ward = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();

        Department department = DepartmentFactory.getDepartment("Ward", "Room");
        departmentRepository.create(department);

        assertNotNull(departmentRepository.getAll());

        List<Ward> ward2 = new ArrayList<>();
        List<Room> rooms2 = new ArrayList<>();

        Department departmentUpdate = DepartmentFactory.getDepartment("Ward", "Room");
        departmentUpdate.setDepartmentId(department.getDepartmentId());
        departmentRepository.update(departmentUpdate);

        Department updated = departmentRepository.read(departmentUpdate.getDepartmentId());

        assertEquals(departmentUpdate, updated);

    }

    @Test
    public void delete() {

        List<Ward> ward = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();

        Department department = DepartmentFactory.getDepartment("Ward", "Room");
        departmentRepository.create(department);

        assertNotNull(departmentRepository.getAll());

        departmentRepository.delete(department.getDepartmentId());

        Department dep = departmentRepository.read(department.getDepartmentId());

       assertNull(dep);


    }
}