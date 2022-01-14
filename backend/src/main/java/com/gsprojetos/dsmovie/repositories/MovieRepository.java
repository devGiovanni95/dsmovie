package com.gsprojetos.dsmovie.repositories;

import com.gsprojetos.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
