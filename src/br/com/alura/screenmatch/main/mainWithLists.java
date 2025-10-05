package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;


public class mainWithLists {
    static void main() {
        var movie1 = new Movie("O padrinho", 1972);
        movie1.rateTitle(8);
        var movie2 = new Movie("Avatar", 2009);
        movie2.rateTitle(10);
        var movie3 = new Movie("Carros", 2006);
        movie3.rateTitle(5);

        var serie1 = new Serie("Lost", 2005);
        serie1.rateTitle(8);
        var serie2 = new Serie("Breaking Bad", 2007);
        serie2.rateTitle(10);

        ArrayList<Title> titleList = new ArrayList<>();
        titleList.add(movie1);
        titleList.add(movie2);
        titleList.add(movie3);
        titleList.add(serie1);
        titleList.add(serie2);

        for(Title item : titleList){
            //System.out.println(item.getName() + " - Estrelas: " + item.getRatingStars());
            item.showInfo();
        }
    }
}
