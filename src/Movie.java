public class Movie {
    String title;
    int releaseYear;
    int totalRatings;
    double ratingSum;
    boolean isAvailableOnPlan;
    int durationInMinutes;

    void showInfo(){
        System.out.println("\nNome do filme: " + title);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração total: " + durationInMinutes + " minutos");
    }

    void rateMovie(double note){
        ratingSum += note;
        totalRatings++;
    }

    double getRating(){
        return ratingSum / totalRatings;
    }
}
