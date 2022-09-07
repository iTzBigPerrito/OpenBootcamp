package com.ejercicio.EjerciciosSpring456.controllers;

import com.ejercicio.EjerciciosSpring456.entities.Laptop;
import com.ejercicio.EjerciciosSpring456.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    //Atributos
    private LaptopRepository repositoryLap;
    //Constructores

    public LaptopController(LaptopRepository repositoryLap) {
        this.repositoryLap = repositoryLap;
    }
    //Métodos
    //Obtener todos los objetos Laptop de la BBDD
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return repositoryLap.findAll();
    }

    //Crear un nuevo objeto Laptop a partir de una petición POST http
    @PostMapping("/api/laptops")
    public Laptop saveNew(@RequestBody Laptop laptop){
        return repositoryLap.save(laptop);
    }
}