package com.maincrud.main.service;

import com.maincrud.main.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);

    Employee save(Employee employee);

    void deleteEmployee(Long id);
}
