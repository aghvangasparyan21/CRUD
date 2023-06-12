package com.maincrud.main.service;

import com.maincrud.main.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteEmployee(int id);
}
