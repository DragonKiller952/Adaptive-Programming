package Code;

import Code.Node;

public class Rit extends Stap {
    int kilometers;

    public Rit(int kilometers, Node bestemming) {//innitialiseert em maakt een verbinding met Code.Stap
        super(bestemming);
        this.kilometers = kilometers;
    }

    public int getAfstand() {// haalt de kilometers op van rit
        return kilometers;
    }

    @Override
    public String toString() {
        return "("+kilometers+", "+super.getBestemming().getName()+")";
    }
}
