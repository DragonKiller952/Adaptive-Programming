import java.util.Scanner;

public class Main {

    public static void main(String[] program) {

        //Create nodes
        Node s0 = new Node("s0", false);
        Node s1 = new Node("s1", false);
        Node s2 = new Node("s2", false);
        Node s3 = new Node("s3", false);
        Node s4 = new Node("s4", true);

        //Connect all the nodes
        s0.addNode("A", s2);
        s0.addNode("B", s1);
        s0.addNode("C", s3);
        s1.addNode("A", s1);
        s1.addNode("B", s2);
        s1.addNode("C", s3);
        s2.addNode("B", s3);
        s3.addNode("A", s4);
        s3.addNode("B", s0);
        s3.addNode("C", s1);

        //Read from the console (keyboard)
        System.out.println("Geef het programma:");
        Scanner in = new Scanner(System.in);
        String myInput = in.nextLine().toUpperCase();
        String [] myProgram = myInput.split("");

        // Starts the right program according to input
        if (!myProgram[0].equals("")){
            //Create new FSM
            FSM fsm = new FSM();
            fsm.setProgram(myProgram); //set the program
            fsm.setCurrentNode(s0); //Set the startnode
            fsm.run(); //run the program
            System.out.println(fsm);
        }
        else{
            //Create new DTMC
            DTMC dtmc = new DTMC();
            dtmc.setCurrentNode(s0); //Set the startnode
            dtmc.run(); //run the program
            System.out.println(dtmc); //Runs the program and prints the ending node
        }
    }
}
