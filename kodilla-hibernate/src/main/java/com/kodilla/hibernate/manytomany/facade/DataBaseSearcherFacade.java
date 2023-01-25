package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseSearcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataBaseSearcherFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public DataBaseSearcherFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void findCompanyByName(String name) throws SearcherProcessingException {

        LOGGER.info("Start Searching Company name containing " + name);
        List<Company> companyList = companyDao.findCompanyByPartOfTheName(name);

        try {
            if (companyList.isEmpty()) {
                LOGGER.warn("No Results found");
                throw new SearcherProcessingException(SearcherProcessingException.ERR_COMPANY_NAME_NOT_FOUND);
            }else {
                LOGGER.info("Search result");
                for (Company company : companyList) {
                    System.out.println(company.getName());
                }
            }
        } finally {
            LOGGER.info("Wyszukiwanie zakonczone");
        }
    }

    public void findEmployeeByPartOfTheName(String name) throws SearcherProcessingException {

        LOGGER.info("Start Searching Employee name containing " + name);
        List<Employee> employeeList = employeeDao.findEmployeeByPartOfTheName(name);

        try {
            if (employeeList.isEmpty()) {
                LOGGER.warn("No Results found");
                throw new SearcherProcessingException(SearcherProcessingException.ERR_EMPLOYEE_NAME_NOT_FOUND);
            }else {
                LOGGER.info("Wynik wyszukiwania");
                for (Employee employee : employeeList) {
                    System.out.println(employee.getLastname());
                }
            }
        } finally {
            LOGGER.info("Wyszukiwanie zakonczone");
        }
    }


}
