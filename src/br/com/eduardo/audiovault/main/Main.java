package br.com.eduardo.audiovault.main;

import br.com.eduardo.audiovault.models.MyFavorites;
import br.com.eduardo.audiovault.models.Music;
import br.com.eduardo.audiovault.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Do I Wanna Know");
        myMusic.setSinger("Arctic Monkeys");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Flow");
        myPodcast.setPresenter("Igor3K");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.add(myPodcast);
        myFavorites.add(myMusic);
    }
}