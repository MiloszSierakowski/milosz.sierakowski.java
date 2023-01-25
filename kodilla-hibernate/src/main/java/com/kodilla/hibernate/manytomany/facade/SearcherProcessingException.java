package com.kodilla.hibernate.manytomany.facade;

public class SearcherProcessingException extends Exception{

    public static String ERR_COMPANY_NAME_NOT_FOUND = "Company name not found";
    public static String ERR_EMPLOYEE_NAME_NOT_FOUND = "Employee name not found";

    public SearcherProcessingException(String message) {
        super(message);
    }
}
