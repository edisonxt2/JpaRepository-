package com.gestion.libreria.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestion.libreria.repository.libreriaRepository;
import com.gestion.libreria.entity.libro;


@RestController
@RequestMapping("/api/proyecto")
public class libreriaController {

    private final libreriaRepository repo;
    public libreriaController (libreriaRepository libreriaRepository){
        this.repo = libreriaRepository;
    }

    @PostMapping
    public libro crearlibro(@RequestBody libro libro){
        return repo.save(libro);
    }



}
