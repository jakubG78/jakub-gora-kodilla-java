package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyMapper {
    public List<CompanyDto> mapToCompanyDtoList (final List<Company> companies){
        return companies.stream()
                .map(c-> new CompanyDto(c.getName()))
                .collect(Collectors.toList());
    }
}
