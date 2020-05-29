package Code;

import Code.Node;

public class Stap {
    private int afstand;
    private Node bestemming;

    public Stap(Node bestemming) {// initialiseert Code.Stap voor  de classes die het extenden
        this.bestemming = bestemming;
    }

    public Stap(int afstand, Node bestemming){
        this.afstand = afstand;
        this.bestemming = bestemming;
    }

    public int getAfstand() {// haalt de afstand op van Code.Stap
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
