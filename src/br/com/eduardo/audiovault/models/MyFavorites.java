package br.com.eduardo.audiovault.models;

public class MyFavorites {
    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " is an absolute success and " +
                    "everyone's favorite!");
        } else {
            System.out.println(audio.getTitle() + " is also one of the ones " +
                    "that everyone is enjoying");
        }
    }
}