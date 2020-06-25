package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyDto {
    private final String companyName;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private CompanyMapper companyMapper;

    public CompanyDto(final String companyName) {
        this.companyName = companyName;
    }

    public void addCompany(CompanyDto companyDto){
        Company company = companyMapper.mapToCompany(companyDto);
        companyDao.save(company);
    }

    public String getCompanyName() {
        return companyName;
    }
}
