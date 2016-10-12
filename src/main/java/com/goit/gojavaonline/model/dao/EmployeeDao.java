package com.goit.gojavaonline.model.dao;

import com.goit.gojavaonline.model.Employee;

import java.util.List;


public interface EmployeeDao {


    void save(Employee employee);
    Employee load(Long id);
    List<Employee> findAll();
    Employee findByName(String name);
    void remove(Employee employee);
    void removeAll();

}
