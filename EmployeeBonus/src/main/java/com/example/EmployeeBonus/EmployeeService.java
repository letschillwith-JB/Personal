package com.example.EmployeeBonus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveAllEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    public List<Employee> getEmployeesEligibleForBonus(LocalDate date) {
        return employeeRepository.findAll().stream()
                .filter(employee -> !employee.getJoiningDate().isAfter(date) && !employee.getExitDate().isBefore(date))
                .collect(Collectors.toList());
    }
}
