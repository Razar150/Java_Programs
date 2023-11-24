

import java.util.ArrayList;
import java.util.List;;

import java.util.Scanner;


public class MainGameManager {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();


        Game game1 = new ActionGame(1, "Valorant", 4.5f);
        Game game2 = new StrategyGame(2, "COC", 4.2f);
        Game game3 = new AdventureGame(3, "Assasins Creeed", 4.8f);
        Game game4 = new SimulationGame(4, "Truck Simulation", 4.0f);
        Game game5 = new FightingGame(5, "WWE 4K", 4.7f);

        gameManager.addGame(game1);
        gameManager.addGame(game2);
        gameManager.addGame(game3);
        gameManager.addGame(game4);
        gameManager.addGame(game5);


        gameManager.displayGamesByCategory();


        User user = new User("Raxith");
        SettingsPage settingsPage = new SettingsPage(user);
        settingsPage.changeUsername("Rolex");


        System.out.println("Updated Username: " + user.getUserName());

    }
}
