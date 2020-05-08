import java.util.Scanner;

public class Main {

    public static void main(String[] program) {

        //Create nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        //Connect all the nodes
        s0.setNodeA(s2);
        s0.setNodeB(s1);
        s1.setNodeA(s1);
        s1.setNodeB(s2);
        s2.setNodeB(s3);
        s3.setNodeA(s3);
        s3.setNodeB(s0);

        //Read from the console (keyboard)
        System.out.println("Geef het programma:");
        Scanner in = new Scanner(System.in);
        String myInput = in.nextLine().toUpperCase();
        String [] myProgram = myInput.split("");

        //Create new State machine
        FSM fsm = new FSM();
        fsm.setProgram(myProgram); //set the program
        fsm.setCurrentNode(s0); //Set the startnode
        fsm.run(); //run the program
        System.out.println(fsm);




    }
}
