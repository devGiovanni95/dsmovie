package com.gsprojetos.dsmovie.services;

import com.gsprojetos.dsmovie.dto.MovieDTO;
import com.gsprojetos.dsmovie.dto.ScoreDTO;
import com.gsprojetos.dsmovie.entities.Movie;
import com.gsprojetos.dsmovie.entities.Score;
import com.gsprojetos.dsmovie.entities.User;
import com.gsprojetos.dsmovie.repositories.MovieRepository;
import com.gsprojetos.dsmovie.repositories.ScoreRepository;
import com.gsprojetos.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional//arquivo so de leitura
    public MovieDTO saveScore(ScoreDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null) {
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        //Para percorrer a lista de scores e somar tudo
        double sum = 0.0;
        for (Score s : movie.getScores()){
            sum = sum + s.getValue();
        }

        //para calcular a media
        double avg = sum / movie.getScores().size();

        //para salvar os novos dados
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        //salvar no database
        movie = movieRepository.save(movie);

        return new MovieDTO(movie);//ja fazendo a conversao para dto

    }

  }
