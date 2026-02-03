public class Main {
    public static void main(String[] args) {

        System.out.println("--- Caissier 1 ---");
        TPE tpe1 = TPE.getInstance();
        tpe1.addTransaction(10.0);
        tpe1.addTransaction(9.0);

        System.out.println("\n--- Caissier 2 ---");
        TPE tpe2 = TPE.getInstance();
        tpe2.addTransaction(8.0);
        tpe2.addTransaction(10.0);

        System.out.println("\n--- Caissier 3 ---");
        TPE tpe3 = TPE.getInstance();
        tpe3.addTransaction(9.0);
        tpe3.addTransaction(8.0);


        System.out.println("\nChiffre d'affaires final : " + tpe1.getCA() + "€");

        tpe1.reset();

        System.out.println("Chiffre d'affaires après reset : " + tpe1.getCA() + "€");
    }
}
