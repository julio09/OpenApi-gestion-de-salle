package com.example.devestack.devstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devestack.devstack.Entity.Professeur;
import com.example.devestack.devstack.Repository.professeurRepo;

@Service
public class Professeurservice {

    @Autowired
    public professeurRepo professeurRepo;
    
    /**
     * @param professeur
     * @return
     */
    public Professeur createProf(Professeur professeur){
        return professeurRepo.save(professeur);
    }

    public Professeur findAll(){
        return (Professeur) professeurRepo.findAll();
    }
}
