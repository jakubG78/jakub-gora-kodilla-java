package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmploeeDaoTestSuite {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testEmploeeLastNameContainQuery() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> resultEmployeeList = employeeDao.retrieveEmployeeWithLastNameContain("arkso");

        //Then
        Assert.assertEquals(1, resultEmployeeList.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(stephanieClarckson.getId());
            employeeDao.deleteById(lindaKovalsky.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
