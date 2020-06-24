package com.kodilla.hibernate.manytomany.facade;

public class CompanyDto {
    private final String companyName;

    public CompanyDto(final String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
