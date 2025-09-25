package br.com.alura.screenmatch.modelos;

public class Movie {
    // Movie class attributes
    private String title;
    private int releaseYear;
    private int totalRatings;
    private int durationInMinutes;
    private double ratingSum;
    private boolean isAvailableOnPlan;

    // Movie class setters
    public void setTitle(String title) {this.title = title;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}
    public void setAvailableOnPlan(boolean availableOnPlan) {isAvailableOnPlan = availableOnPlan;}
    public void setDurationInMinutes(int durationInMinutes) {this.durationInMinutes = durationInMinutes;}

    // Movie class getters
    public String getTitle() {return title;}
    public int getReleaseYear() {return releaseYear;}
    public boolean isAvailableOnPlan() {return isAvailableOnPlan;}
    public int getDurationInMinutes() {return durationInMinutes;}

    // Method to show info from movie on screen
    public void showInfo(){
        System.out.println("\nNome do filme: " + title);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração total: " + durationInMinutes + " minutos");
        IO.println("A nota atual do filme: " + this.getTitle() + " é: " + this.getRating());
    }

    // Method to rate a movie
    public void rateMovie(double note){
        ratingSum += note;
        totalRatings++;
    }

    // Method to get the rating from the movie
    public double getRating(){
        return ratingSum / totalRatings;
    }
}
