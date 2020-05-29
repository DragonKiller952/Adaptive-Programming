public class Vlucht extends Stap {
    int euros;

    public Vlucht(int euros, Node bestemming) {
        super(bestemming);
        this.euros = euros;
    }

    public int getAfstand() {
        return euros;
    }

    @Override
    public String toString() {
        return "("+euros+", "+super.getBestemming().getName()+")";
    }
}
