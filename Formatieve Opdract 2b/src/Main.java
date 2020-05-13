import java.util.Random;

public class Main {
    public static void main(String[] argument) {
        Node s0 = new Node("1", false);
        Node s1 = new Node("2", false);
        Node s2 = new Node("3", false);
        Node s3 = new Node("3", false);
        Node s4 = new Node("4", false);
        Node s5 = new Node("5", false);
        Node s6 = new Node("6", false);
        Node s7 = new Node("Side 1", true);
        Node s8 = new Node("Side 2", true);
        Node s9 = new Node("Side 3", true);
        Node s10 = new Node("Side 4", true);
        Node s11 = new Node("Side 5", true);
        Node s12 = new Node("Side 6", true);

        s0.addNode(s1);
        s0.addNode(s2);
        s1.addNode(s3);
        s1.addNode(s4);
        s2.addNode(s5);
        s2.addNode(s6);
        s3.addNode(s1);
        s3.addNode(s7);
        s4.addNode(s8);
        s4.addNode(s9);
        s5.addNode(s10);
        s5.addNode(s11);
        s6.addNode(s12);
        s6.addNode(s2);

        DTMC dtmc = new DTMC();
        dtmc.setCurrentNode(s0); //Set the startnode
        System.out.println(dtmc.run()); //Runs the program and prints the ending node

    }
}
