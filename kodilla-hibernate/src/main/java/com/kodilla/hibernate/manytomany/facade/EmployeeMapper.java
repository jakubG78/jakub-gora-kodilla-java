package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    public List<EmployeeDto> mapToEmployeeDtoList (final List<Employee> employees){
        return employees.stream()
                .map(e-> new EmployeeDto(e.getFirstName(),e.getLastName()))
                .collect(Collectors.toList());
    }

    public Employee mapToEmployee (EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getFirstName(),
                employeeDto.getLastName());
    }
}
