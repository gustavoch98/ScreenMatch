import br.com.alura.screenmatch.modelos.Movie;

void main() {

    // Generating a new movie
    Movie myMovie = new Movie();

    // Giving attributes for the movie
    myMovie.setTitle("Top Gun Maverick");
    myMovie.setReleaseYear(2022);
    myMovie.setAvailableOnPlan(true);
    myMovie.setDurationInMinutes(125);

    // Rating the movie
    myMovie.rateMovie(10);
    myMovie.rateMovie(6);
    myMovie.rateMovie(8.5);

    myMovie.showInfo();
}
