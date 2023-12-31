package com.example.employeeManagement.repositories;

import com.example.employeeManagement.entities.Interns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternsRepository extends JpaRepository<Interns, Integer> {
}
