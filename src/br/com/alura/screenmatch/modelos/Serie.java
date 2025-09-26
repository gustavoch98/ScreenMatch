package br.com.alura.screenmatch.modelos;

public class Serie extends Title{
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;
    private boolean active;

    public int getSeasons() {return seasons;}
    public int getEpisodesPerSeason() {return episodesPerSeason;}
    public int getMinutesPerEpisode() {return minutesPerEpisode;}
    public boolean isActive() {return active;}

    public void setEpisodesPerSeason(int episodesPerSeason) {this.episodesPerSeason = episodesPerSeason;}
    public void setMinutesPerEpisode(int minutesPerEpisode) {this.minutesPerEpisode = minutesPerEpisode;}
    public void setSeasons(int seasons) {this.seasons = seasons;}
    public void setActive(boolean active) {this.active = active;}

    @Override
    public int getDurationInMinutes() {
        return seasons * minutesPerEpisode * episodesPerSeason;
    }

    @Override
    public void showInfo(){
        System.out.println("\nNome da série: " + this.getName());
        System.out.println("Ano de lançamento: " + this.getReleaseYear());
        System.out.println("Duração total: " + this.getDurationInMinutes() + " minutos");
        System.out.println("Nota Atual " + this.getName() + " é: " + this.getRating());
    }
}
