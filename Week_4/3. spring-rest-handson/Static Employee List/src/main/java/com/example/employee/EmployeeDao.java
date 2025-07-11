package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {

    public static List<Employee> EMPLOYEE_LIST = new ArrayList<>();
    private final List<Employee> employeeListFromXml;

    @Autowired
    public EmployeeDao(List<Employee> employeeListFromXml) {
        this.employeeListFromXml = employeeListFromXml;
    }

    @PostConstruct
    public void init() {
        EMPLOYEE_LIST.clear();
        EMPLOYEE_LIST.addAll(employeeListFromXml);
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}