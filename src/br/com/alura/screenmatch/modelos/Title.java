package br.com.alura.screenmatch.modelos;

public class Title {
    // Title class attributes
    private String name;
    private int releaseYear;
    private int totalRatings;
    private int durationInMinutes;
    private double ratingSum;
    private boolean isAvailableOnPlan;

    // Movie class setters
    public void setName(String name) {this.name = name;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}
    public void setAvailableOnPlan(boolean availableOnPlan) {isAvailableOnPlan = availableOnPlan;}
    public void setDurationInMinutes(int durationInMinutes) {this.durationInMinutes = durationInMinutes;}

    // Movie class getters
    public String getName() {return name;}
    public int getReleaseYear() {return releaseYear;}
    public int getDurationInMinutes() {return durationInMinutes;}
    public boolean isAvailableOnPlan() {return isAvailableOnPlan;}

    // Method to show info from movie on screen
    public void showInfo(){
        System.out.println("\nNome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração total: " + durationInMinutes + " minutos");
        System.out.println("Nota atual: " + this.getName() + " é: " + this.getRating());
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
}
