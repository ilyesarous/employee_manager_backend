package com.example.employeeManagement.services;

import com.example.employeeManagement.entities.Interns;
import com.example.employeeManagement.repositories.InternsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InternsServices {

    private InternsRepository internsRepository;

    public List<Interns> getAll(){
        return internsRepository.findAll();
    }
    public String addIntern(Interns i){
        internsRepository.save(i);
        return "intern added successfully";
    }
    public String deleteIntern(int id){
        if (internsRepository.findById(id).isPresent()) {
            internsRepository.delete(internsRepository.getReferenceById(id));
            return "intern deleted successfully";
        }
        return "intern not found";
    }

}
