package com.example.employeeManagement.controllers;

import com.example.employeeManagement.entities.Pto;
import com.example.employeeManagement.services.PtoServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/ptos")
public class PtoController {
    private PtoServices ptoServices;

    @GetMapping
    public List<Pto> getAllRequests(){
        return ptoServices.getAll();
    }
    @PostMapping("/request")
    public String requestPto(@Valid @RequestBody Pto p){
        return ptoServices.addPto(p);
    }
    @PutMapping("/update/{id}")
    public String updatePto(@Valid @PathVariable int id, @Valid @RequestBody Pto p){
        return ptoServices.modifyStatus(id, p);
    }
}
