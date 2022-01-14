package com.gsprojetos.dsmovie.controllers;

import com.gsprojetos.dsmovie.dto.MovieDTO;
import com.gsprojetos.dsmovie.dto.ScoreDTO;
import com.gsprojetos.dsmovie.services.MovieService;
import com.gsprojetos.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;


    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;

    }
}
