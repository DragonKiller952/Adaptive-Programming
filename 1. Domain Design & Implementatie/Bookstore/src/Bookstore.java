public class Bookstore {
    public static void main(String[] args) {
        // hier maken we de customers aan
        Customer C1 = new Customer("Henk", "Laanstraat 6", "Soest");
        Customer C2 = new Customer("Peter", "Wollegras 5", "Soest");
        Customer C3 = new Customer("Frank", "Koningstraat 8", "Baarn");

        // hier maken we de boeken en cd's aan
        Book B1 = new Book("Biografie van Jansen", 29.99, "Jan Jansen");
        Book B2 = new Book("Het leven van Pieteren", 5.00, "Piet Pietersen");
        Book B3 = new Book("Sandy's book of dessert's", 16.25, "Sandra Sandy");
        Book B4 = new Book("John, and everything else", 12.50, "John Johnson");
        Cd Cd1 = new Cd("Bubbelgum K.K.", 32.95, "K.K. Slider");

        // hier maken we de bestellingen aan, en bind ze aan customers
        Bestelling Bes1 = new Bestelling(10);
        Bestelling Bes2 = new Bestelling(15);
        Bestelling Bes3 = new Bestelling(20);

        // hier voegen we items aan de bestellingen toe
        Bes1.addItem(B1);
        Bes1.addItem(B2);
        Bes1.addItem(B3);

        Bes2.addItem(B1);
        Bes2.addItem(B2);
        Bes2.addItem(B3);
        Bes2.addItem(B4);
        Bes2.addItem(Cd1);

        Bes3.addItem(B2);
        Bes3.addItem(B2);
        Bes3.addItem(B2);
        Bes3.addItem(B2);
        Bes3.addItem(B2);

        // hier geven we customers bestellingen
        C1.addBestelling(Bes1);
        C1.addBestelling(Bes3);
        C2.addBestelling(Bes2);
        C3.addBestelling(Bes3);

        // hier geven we de bestellingen en customers:
        System.out.println("Customers: \n");
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());
        System.out.println("Bestellingen: \n");
        System.out.println(Bes1.toString());
        System.out.println(Bes2.toString());
        System.out.println(Bes3.toString());

        // voeren we wat andere dingen uit
        System.out.println("Veranderingen: \n");

        C1.removeBestelling(Bes2);
        C1.removeBestelling(Bes1);
        System.out.println(C1.toString());

        Bes3.addItem(Cd1);

        System.out.println(Bes3.toString());




    }
}
