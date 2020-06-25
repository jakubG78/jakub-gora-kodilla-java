package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CompanyAndEmployeeFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private CompanyMapper companyMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);

    public List<EmployeeDto> findEmployeesWithLastName(final String lastName) {
        List<EmployeeDto> resultEmployeesList = employeeMapper.mapToEmployeeDtoList(employeeDao.retrieveEmployeeWithLastName(lastName));
        if (resultEmployeesList.size() == 0) {
            LOGGER.error(CompanyOrEmployeeObjectNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("Returning search result for employees with last name " + lastName);
        }
        return resultEmployeesList;
    }


    public List<CompanyDto> findCompanyWithName(final String companyName) {
        List<CompanyDto> resultCompanyList = companyMapper.mapToCompanyDtoList(companyDao.retrieveCompanyWithNameContain(companyName));
        if (resultCompanyList.size() == 0) {
            LOGGER.error(CompanyOrEmployeeObjectNotFoundException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("Returning search result for company name " + companyName);
        }
        return resultCompanyList;
    }

    public boolean addCompany(CompanyDto companyDto) {
        Company company = companyMapper.mapToCompany(companyDto);
        companyDao.save(company);
        return true;
    }

    public boolean addEmployee(final EmployeeDto employeeDto) {
        Employee employee = employeeMapper.mapToEmployee(employeeDto);
        employeeDao.save(employee);
        return true;
    }
}
