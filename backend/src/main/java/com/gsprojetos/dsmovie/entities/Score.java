package com.gsprojetos.dsmovie.entities;

public class Score {

//    private Movie movie;
//    private User user;
    private ScorePK id = new ScorePK();

    private Double value;

    public Score(){
    }

    public Score(ScorePK id, Double value) {
        this.id = id;
        this.value = value;
    }

    //setar um filme dentro  da classe score
    public void setMovie(Movie movie){
        id.setMovie(movie);
    }

    //setar um usuario dentro  da classe score
    public void setUser(User user){
        id.setUser(user);
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
