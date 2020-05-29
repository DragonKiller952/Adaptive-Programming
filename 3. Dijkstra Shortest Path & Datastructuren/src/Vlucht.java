public class Vlucht extends Stap {
    int euros;

    public Vlucht(int euros, Node bestemming) {//innitialiseert em maakt een verbinding met Stap
        super(bestemming);
        this.euros = euros;
    }

    public int getAfstand() {//haalt de euros op van vlucht
        return euros;
    }

    @Override
    public String toString() {
        return "("+euros+", "+super.getBestemming().getName()+")";
    }
}
