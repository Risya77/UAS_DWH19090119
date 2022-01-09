package com.example.AuliaRizqisyarifa19090119.service;

import com.example.AuliaRizqisyarifa19090119.domain.Fakta;
import com.example.AuliaRizqisyarifa19090119.repository.FaktaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class FaktaService {
    @Autowired
    private FaktaRepo repo;

    public List<Fakta> listAll(){
        return repo.findAll();
    }
    public void save(Fakta fkt){
        repo.save(fkt);
    }
    public Fakta get(long id){
        return repo.findById(id).get();
    }
    public void delete(long id){
        repo.deleteById(id);
    }
}
