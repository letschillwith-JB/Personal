package com.example.EmployeeBonus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tci")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee-bonus")
    public void addEmployees(@RequestBody Map<String, List<Employee>> payload) {
        employeeService.saveAllEmployees(payload.get("employees"));
    }

    @GetMapping("/employee-bonus")
    public Map<String, List<Employee>> getEligibleEmployees(@RequestParam("date") String date) {
        LocalDate requestDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        List<Employee> eligibleEmployees = employeeService.getEmployeesEligibleForBonus(requestDate);
        return eligibleEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getCurrency));
    }
}

