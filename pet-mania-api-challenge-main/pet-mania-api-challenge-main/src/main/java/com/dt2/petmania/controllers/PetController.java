package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "*")
public class PetController {

   private final PetRepository petRepository;
   public PetController(PetRepository petRepository) {
       this.petRepository = petRepository;
   }

   @GetMapping
    public List<Pet> mostrar() {
       return petRepository.findAll();
   }

   @PostMapping
    public void criar(@RequestBody Pet pet) {
       petRepository.save(pet);
   }
}

