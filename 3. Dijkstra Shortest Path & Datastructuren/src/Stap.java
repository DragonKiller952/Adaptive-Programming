public class Stap {
    private int afstand;
    private Node bestemming;

    public Stap(Node bestemming) {// initialiseert Stap voor  de classes die het extenden
        this.bestemming = bestemming;
    }

    public Stap(int afstand, Node bestemming){
        this.afstand = afstand;
        this.bestemming = bestemming;
    }

    public int getAfstand() {// haalt de afstand op van Stap
        return afstand;
    }

    public Node getBestemming() {//haalt de bestemmingsnode op van stap
        return bestemming;
    }

    @Override
    public String toString() {
        return "("+afstand+", "+bestemming.getName()+")";
    }
}
