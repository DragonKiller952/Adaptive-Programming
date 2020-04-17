import java.time.LocalDate;
public class Game {
    private String naam;
    private int releaseJaar;
    private double prijs;

    public Game(String nm, int rJ, double pr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.prijs = pr;
    }

    public String toString(){
        return naam + " " + releaseJaar + " " + prijs;
    }
    public double getPrice(){
        return this.prijs;
    }
    public double getReleaseJaar(){
        return this.releaseJaar;
    }
    public String getNaam(){
        return this.naam;
    }
}
