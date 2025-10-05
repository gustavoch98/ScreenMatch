package br.com.alura.screenmatch.modelos;

public class Title {
    // Title class attributes
    private String name;
    private int releaseYear;
    private int totalRatings;
    private int durationInMinutes;
    private double ratingSum;
    private boolean isAvailableOnPlan;

    public Title(String name, int releaseYear){
        this.name = name;
        this.releaseYear = releaseYear;
    }

    // Movie class setters
    public void setName(String name) {this.name = name;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}
    public void setAvailableOnPlan(boolean availableOnPlan) {isAvailableOnPlan = availableOnPlan;}
    public void setDurationInMinutes(int durationInMinutes) {this.durationInMinutes = durationInMinutes;}

    // Movie class getters
    public String getName() {return this.name + " (" + this.getReleaseYear() + ")"; }
    public int getReleaseYear() {return this.releaseYear;}
    public int getDurationInMinutes() {return this.durationInMinutes;}
    public boolean isAvailableOnPlan() {return this.isAvailableOnPlan;}

    // Method to show info from movie on screen
    public void showInfo(){
        System.out.println("\nNome do filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Duração total: " + this.durationInMinutes + " minutos");
        System.out.println("Nota atual: " + this.getRating());
    }

    // Method to rate a movie
    public void rateTitle(double note){
        ratingSum += note;
        totalRatings++;
    }

    // Method to get the rating from the movie
    public double getRating(){
        return ratingSum / totalRatings;
    }

    public int getRatingStars(){
        return (int) (ratingSum / totalRatings) / 2;
    }
}
