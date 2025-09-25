void main() {
    Movie myMovie = new Movie();

    myMovie.title = "Top Gun Maverick";
    myMovie.releaseYear = 2022;
    myMovie.isAvailableOnPlan = true;
    myMovie.durationInMinutes = 125;

    myMovie.showInfo();

    myMovie.rateMovie(10);
    myMovie.rateMovie(6);
    myMovie.rateMovie(8.5);

    IO.println("A nota atual desse filme é: " + myMovie.getRating());
}
