package br.com.alura.screenmatch.calculadoras;

import br.com.alura.screenmatch.modelos.Title;

// Class to calculate the total time to watch all movies and series
public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void addTime(Title title){
        totalTime += title.getDurationInMinutes();
    }
}
