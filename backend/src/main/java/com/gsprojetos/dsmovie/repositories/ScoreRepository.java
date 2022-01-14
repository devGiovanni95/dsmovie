package com.gsprojetos.dsmovie.repositories;

import com.gsprojetos.dsmovie.entities.Score;
import com.gsprojetos.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
