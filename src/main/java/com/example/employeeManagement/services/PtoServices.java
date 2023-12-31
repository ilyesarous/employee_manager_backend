package com.example.employeeManagement.services;

import com.example.employeeManagement.entities.Pto;
import com.example.employeeManagement.repositories.PtoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PtoServices {

    private PtoRepository ptoRepository;

    public String addPto(Pto p) {
        p.setStatus("");
        ptoRepository.save(p);
        return "PTO added successfully";
    }

    public List<Pto> getAll() {
        return ptoRepository.findAll();
    }
    public String modifyStatus(int id, Pto pto) {
        Pto p;
        if (ptoRepository.findById(id).isPresent()) {
            p = ptoRepository.findById(id).get();
            p.setStatus(pto.getStatus());
            ptoRepository.save(p);
            return "updated successfully";
        }
        return "pto not found";
    }

}
