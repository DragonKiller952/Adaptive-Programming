import java.util.ArrayList;
import java.time.LocalDate;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games;

    public Persoon(String nm, int bg){
        this.naam = nm;
        this.budget = bg;
        this.games = new ArrayList<Game>();
    }

    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append(naam).append(" heeft een budget van €").append(budget).append(" en bezit de volgende games:\n");
        for (Game game : this.games) {
            message.append(game.toString());
        }
        return message.toString();
    }

    public String koop(Game game){
        if (game != null){
            String newPriceRaw = String.format("%.2f",game.getPrice()*(Math.pow(0.7, (LocalDate.now().getYear()-game.getReleaseJaar()))));
            double newPrice = Double.parseDouble(newPriceRaw);
            if (newPrice < this.budget){
                 if (!hasGame(game)) {

                        this.budget = this.budget - newPrice;
                        games.add(game);
                        return this.naam+" koopt " +game.getNaam()+": gelukt";
                    }
            }

            return this.naam+" koopt " +game.getNaam()+": niet gelukt";
        }
        return null;
    }

    public boolean hasGame(Game game) {
        boolean hasGame = false;
        for (Game game1 : this.games) {
            if (game1.getNaam().equals(game.getNaam())) {
                hasGame = true;
            }
        }
        return hasGame;
    }

    public boolean otherHasGame(Game game, Persoon koper) {
        boolean hasGame = false;
        for (Game game1 : koper.games) {
            if (game1.getNaam().equals(game.getNaam())) {
                hasGame = true;
            }
        }
        return hasGame;
    }
    public String verkoop(Game g,Persoon koper){
        if (g != null){
            String newPriceRaw = String.format("%.2f",g.getPrice()*(Math.pow(0.7, (LocalDate.now().getYear()-g.getReleaseJaar()))));
            double newPrice = Double.parseDouble(newPriceRaw);
            if (newPrice < koper.budget){
                if (hasGame(g)&&!otherHasGame(g, koper)) {

                    this.budget = this.budget + newPrice;
                    koper.budget = koper.budget - newPrice;
                    this.games.remove(g);
                    koper.games.add(g);
                    return this.naam+" verkoopt " +g.getNaam()+" aan "+koper.naam+": gelukt";
                }
            }

            return this.naam+" verkoopt " +g.getNaam()+" aan "+koper.naam+": niet gelukt";
        }
        return null;

    }
}
