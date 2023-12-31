package com.example.employeeManagement.controllers;

import com.example.employeeManagement.entities.Interns;
import com.example.employeeManagement.services.InternsServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/interns")
public class InternController {
    private InternsServices internsServices;
    @GetMapping
    public List<Interns> getAll(){
        return internsServices.getAll();
    }
    @PostMapping("/addIntern")
    public String addIntern(@Valid @RequestBody Interns i){
        return internsServices.addIntern(i);
    }
    @DeleteMapping("/deleteIntern/{i}")
    public String deleteIntern(@Valid @PathVariable int i){
        return internsServices.deleteIntern(i);
    }
}
