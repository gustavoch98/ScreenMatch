package br.com.alura.screenmatch.modelos;

public class Movie extends Title {
    private String director;

    public Movie(String name, int releaseYear){
        super(name, releaseYear);
    }
    public String getDirector() {return director;}

    public void setDirector(String director) {this.director = director;}
}
