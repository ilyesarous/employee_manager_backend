package com.example.employeeManagement.repositories;

import com.example.employeeManagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
