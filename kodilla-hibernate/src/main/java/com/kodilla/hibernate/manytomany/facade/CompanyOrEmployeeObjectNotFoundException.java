package com.kodilla.hibernate.manytomany.facade;

public class CompanyOrEmployeeObjectNotFoundException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "There is no employee in database with last name matching query";
    public static String ERR_COMPANY_NOT_FOUND = "There is no company in database with name matching query";

    public CompanyOrEmployeeObjectNotFoundException(String message) {
        super(message);
    }
}
