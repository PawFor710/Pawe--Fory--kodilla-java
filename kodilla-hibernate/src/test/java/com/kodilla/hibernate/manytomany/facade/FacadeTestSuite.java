package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void getCompanyByAnyLetters() {
        //Given
        Company company1 = new Company("FACEBOOK");
        Company company2 = new Company("AMAZON");
        Company company3 = new Company("ALPHABET");
        Company company4 = new Company("APPLE");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        //When
        List<Company> result = companyFacade.getCompany("L");
        //Then
        assertEquals(2, result.size());
        //Cleaning
        companyDao.deleteAll();
    }

    @Test
    public void getEmployeeByAnyLetters() {
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Joshua", "Kowalski");
        Employee employee3 = new Employee("Peter", "Parker");
        Employee employee4 = new Employee("Johanna", "Norman");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        //When
        List<Employee> result = employeeFacade.getEmployee("Jo");
        //Then
        assertEquals(3, result.size());
        //Cleaning
        employeeDao.deleteAll();


    }
}
