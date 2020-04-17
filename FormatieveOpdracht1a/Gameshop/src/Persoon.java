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
            double newPrice = game.getPrice()-((game.getPrice()/100*30)*(LocalDate.now().getYear()-game.getReleaseJaar()));
            if (newPrice < this.budget){
                this.budget = this.budget - newPrice;
                games.add(game);
                return this.naam+" koopt " +game+": gelukt";
            }
            return this.naam+" koopt " +game+": niet gelukt";
        }
        return null;
    }
    public String verkoop(String g,Persoon koper){
        return null;

    }
}
