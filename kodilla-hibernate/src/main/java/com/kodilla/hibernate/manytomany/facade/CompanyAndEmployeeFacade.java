package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<EmployeeDto> findEmployeesWithLastName(final String lastName){
        return employeeMapper.mapToEmployeeDtoList(employeeDao.retrieveEmployeeWithLastName(lastName));
    }

    public List<CompanyDto> findCompanyWithName(final String companyName){
        return companyMapper.mapToCompanyDtoList(companyDao.retrieveCompanyWithNameContain(companyName));
    }
}
