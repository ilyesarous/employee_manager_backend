package com.example.employeeManagement.controllers;

import com.example.employeeManagement.entities.Employee;
import com.example.employeeManagement.services.EmployeeServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeServices employeeServices;
    @PostMapping("/add")
    public String addEmployee(@Valid @RequestBody Employee e){
        return employeeServices.addEmployee(e);
    }
    @DeleteMapping("/delete/{id}")
    public String addEmployee(@Valid @PathVariable int id){
        return employeeServices.deleteEmployee(id);
    }
    @GetMapping
    public List<Employee> getAll(){
        return employeeServices.findAll();
    }

}
