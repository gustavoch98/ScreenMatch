import br.com.alura.screenmatch.calculadoras.TimeCalculator;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

void main() {

    // Generating a new movie
    Movie myMovie = new Movie();

    // Giving attributes for the movie
    myMovie.setName("Top Gun Maverick");
    myMovie.setReleaseYear(2022);
    myMovie.setAvailableOnPlan(true);
    myMovie.setDurationInMinutes(125);

    // Rating the movie
    myMovie.rateTitle(10);
    myMovie.rateTitle(6);
    myMovie.rateTitle(8.5);

    // Showing on Screen
    myMovie.showInfo();

    Serie mySerie = new Serie();
    mySerie.setName("Lost");
    mySerie.setReleaseYear(2006);
    mySerie.setAvailableOnPlan(true);
    mySerie.setSeasons(5);
    mySerie.setEpisodesPerSeason(10);
    mySerie.setMinutesPerEpisode(100);
    mySerie.setActive(false);

    mySerie.rateTitle(10);
    mySerie.rateTitle(10);
    mySerie.rateTitle(8);

    mySerie.showInfo();

    TimeCalculator calculator = new TimeCalculator();
    calculator.addTime(myMovie);
    calculator.addTime(mySerie);
    System.out.println("\nO tempo total para assistir tudo é de: " + calculator.getTotalTime() + " minutos.");
}
