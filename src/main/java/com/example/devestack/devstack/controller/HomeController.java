package com.example.devestack.devstack.controller;

import com.example.devestack.devstack.Entity.Professeur;
import com.example.devestack.devstack.Repository.professeurRepo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Tag(name = "gérer un professeur", description = "Pour faire une CRUD à un professeur")
@RequestMapping(value = "/prof", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    @Autowired
    public professeurRepo professeurRepo;

    @PostMapping
    public Professeur accueil(@RequestBody Professeur professeur){
        return professeurRepo.save(professeur);
    }
    @GetMapping("list/")
    public List<Professeur> List(){
        return professeurRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Professeur> GetIb(@RequestParam String id){
        return professeurRepo.findById(id);
    }
    @DeleteMapping("{id}")
    public void Delete(@RequestParam String id){
        professeurRepo.deleteById(id);
    }
    @PutMapping("{id}")
    public void update(@RequestParam String id, @RequestBody Professeur professeurIn){
        Professeur professeur = professeurRepo.findById(id).orElse(null);
        if (professeur == null){
            return;
        }
            professeur.setNom(professeurIn.getNom());
            professeur.setPrenom(professeurIn.getPrenom());
            professeur.setGrade(professeurIn.getGrade());
            professeurRepo.save(professeur);
    }

}
