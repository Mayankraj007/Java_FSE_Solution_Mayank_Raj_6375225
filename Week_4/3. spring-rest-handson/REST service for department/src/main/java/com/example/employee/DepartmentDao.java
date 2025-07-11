package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DepartmentDao {

    public static List<Department> DEPARTMENT_LIST = new ArrayList<>();
    private final List<Department> departmentListFromXml;

    @Autowired
    public DepartmentDao(List<Department> departmentListFromXml) {
        this.departmentListFromXml = departmentListFromXml;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing DepartmentDao and loading departments from XML...");
        DEPARTMENT_LIST.clear();
        DEPARTMENT_LIST.addAll(departmentListFromXml);
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}