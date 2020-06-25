package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.facade.CompanyAndEmployeeFacade;
import com.kodilla.hibernate.manytomany.facade.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.EmployeeDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeFacadeTestSuite {

    @Autowired
    CompanyAndEmployeeFacade companyAndEmployeeFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void CompanyAndEmployeeFacade() {
        //Given
        companyAndEmployeeFacade.addEmployee(new EmployeeDto("John", "Smith"));
        companyAndEmployeeFacade.addEmployee(new EmployeeDto("Stephanie", "Clarkson"));
        companyAndEmployeeFacade.addEmployee(new EmployeeDto("Linda", "Kovalsky"));
        companyAndEmployeeFacade.addEmployee(new EmployeeDto("Marius", "Kovalsky"));

        companyAndEmployeeFacade.addCompany(new CompanyDto("Software Machine"));
        companyAndEmployeeFacade.addCompany(new CompanyDto("Big Data Maesters"));
        companyAndEmployeeFacade.addCompany(new CompanyDto("Grey Matter Data"));

        //When
        List<EmployeeDto> resultEmployeesDtoList = companyAndEmployeeFacade.findEmployeesWithLastName("Smith");
        List<CompanyDto> resultCompanyDtoList = companyAndEmployeeFacade.findCompanyWithName("Data");

        //Then
        Assert.assertEquals(1, resultEmployeesDtoList.size());
        Assert.assertEquals(2, resultCompanyDtoList.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
