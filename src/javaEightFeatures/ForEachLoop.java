package javaEightFeatures;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> games = new ArrayList<String>();
        games.add("football");
        games.add("cricket");
        games.add("Tenis");
        games.add("Hockey");
        games.add("Chess");
        games.forEach(
                (gamesName) -> System.out.println("Game list is : " + gamesName)
        );
    }
}
