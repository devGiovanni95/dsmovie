package com.gsprojetos.dsmovie.services;

import com.gsprojetos.dsmovie.dto.MovieDTO;
import com.gsprojetos.dsmovie.entities.Movie;
import com.gsprojetos.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired//colocado pra nao necessitar instanciar a classe
    private MovieRepository repository;

    @Transactional(readOnly = true)//arquivo so de leitura
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)//arquivo so de leitura
    public MovieDTO findById(Long id){
        Movie result = repository.findById(id).get();//para acessar um objeto
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}
