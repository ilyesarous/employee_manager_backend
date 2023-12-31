package com.example.employeeManagement.services;

import com.example.employeeManagement.entities.Employee;
import com.example.employeeManagement.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServices {

    private EmployeeRepository employeeRepository;
    public String addEmployee(Employee e){
        employeeRepository.save(e);
        return "employee added successfully";
    }
    public String deleteEmployee(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.delete(employeeRepository.getReferenceById(id));
            return "employee deleted successfully";
        }
        return "employee not found";
    }
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

}
