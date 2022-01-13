package com.gsprojetos.dsmovie.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//CLASSE AUXILIAR PARA FAZER O RELACIONAMENTO DE CHAVE PRIMARIA POIS A RELACAO E MUITO PARA MUITOS
@Embeddable
public class ScorePK  {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public ScorePK(){

    }

    public ScorePK(Movie movie, User user) {
        this.movie = movie;
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
