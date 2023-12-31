package com.example.employeeManagement.repositories;

import com.example.employeeManagement.entities.Pto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PtoRepository extends JpaRepository<Pto, Integer> {
}
