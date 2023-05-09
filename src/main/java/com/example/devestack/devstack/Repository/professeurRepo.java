package com.example.devestack.devstack.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.devestack.devstack.Entity.Professeur;

public interface professeurRepo extends MongoRepository<Professeur, String>{
    
}
