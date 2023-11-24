

import java.util.*;
import java.util.stream.Collectors;

class Game {
    private int id;
    private String name;
    private String category;
    private float rating;

    public Game(int id, String name, String category, float rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Game Id: " + id + ", Game Name: " + name + ", Category: " + category + ", Rating: " + rating;
    }
}

interface Categorizable {
    String getCategory();
}

class ActionGame extends Game implements Categorizable {
    public ActionGame(int id, String name, float rating) {
        super(id, name, "Action", rating);
    }

    @Override
    public String getCategory() {
        return "Action";
    }
}

class StrategyGame extends Game implements Categorizable {
    public StrategyGame(int id, String name, float rating) {
        super(id, name, "Strategy", rating);
    }

    @Override
    public String getCategory() {
        return "Strategy";
    }
}

class AdventureGame extends Game implements Categorizable {
    public AdventureGame(int id, String name, float rating) {
        super(id, name, "Adventure", rating);
    }

    @Override
    public String getCategory() {
        return "Adventure";
    }
}

class SimulationGame extends Game implements Categorizable {
    public SimulationGame(int id, String name, float rating) {
        super(id, name, "Simulation", rating);
    }

    @Override
    public String getCategory() {
        return "Simulation";
    }
}

class FightingGame extends Game implements Categorizable {
    public FightingGame(int id, String name, float rating) {
        super(id, name, "Fighting", rating);
    }

    @Override
    public String getCategory() {
        return "Fighting";
    }
}

class GameManager {
    private List<Game> games;

    public GameManager() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void categorizeGames() {
        Map<String, List<Game>> categorizedGames = games.stream()
                .collect(Collectors.groupingBy(Game::getCategory));

        for (Map.Entry<String, List<Game>> entry : categorizedGames.entrySet()) {
            System.out.println(entry.getKey() + " games:");
            for (Game game : entry.getValue()) {
                System.out.println(game);
            }
            System.out.println();
        }
    }


    public void displayGamesByCategory() {
        categorizeGames();
    }

    public Game getGameByName(String name) {
        return games.stream()
                .filter(game -> game.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}

class User {
    public String userName;
    List<Game> favoriteGames;

    public User(String userName) {
        this.userName = userName;
        favoriteGames = new ArrayList<>();
    }

    public void addFavorite(Game game) {
        favoriteGames.add(game);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

class SettingsPage {
    private User user;

    public SettingsPage(User user) {
        this.user = user;
    }

    public void changeUsername(String newUsername) {
        user.setUserName(newUsername);
    }
}


