package com.antsrl.anotherspringdemo.controller;

import com.antsrl.anotherspringdemo.model.Videogame;
import com.antsrl.anotherspringdemo.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/videogame")
public class VideogameController {

    private final VideogameRepository videogameRepository;

    @Autowired
    public VideogameController(VideogameRepository videogameRepository) {
        this.videogameRepository = videogameRepository;
    }

    @GetMapping(value = "/all")
    public List<Videogame> getALlVideogame() {
        List<Videogame> videogameList = videogameRepository.findAll();
        return videogameList;
    }

    @GetMapping(value = "/find/{id}")
    public Videogame getALlVideogame(@PathVariable Long id) {
        Videogame videogame = videogameRepository.findById(id).get();
        return videogame;
    }

}
