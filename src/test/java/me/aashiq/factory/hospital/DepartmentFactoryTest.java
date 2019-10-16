package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Department;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentFactoryTest {

    @Test
    public void getDepartment() {

        Department department = DepartmentFactory.getDepartment("a", "fa");
        System.out.println(department);

        Assert.assertNotNull(department.getDepartmentId());

    }
}