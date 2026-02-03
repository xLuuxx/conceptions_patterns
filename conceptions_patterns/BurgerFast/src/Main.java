public class Main {
    public static void main(String[] args) {
        CommandeValidationFacade facade = new CommandeValidationFacade();

        System.out.println("TEST 1: Commande valide");
        String[] ingredients1 = {"pain", "viande", "salade", "fromage"};
        boolean resultat1 = facade.validerCommande("user123", ingredients1, 3, "75001");

        System.out.println("\nTEST 2: Hors zone de livraison");
        String[] ingredients2 = {"pain", "viande", "salade"};
        boolean resultat2 = facade.validerCommande("user456", ingredients2, 2, "92000");

        System.out.println("\nTEST 3: Temps insuffisant");
        String[] ingredients3 = {"pain", "viande"};
        boolean resultat3 = facade.validerCommande("user789", ingredients3, 10, "75003");
    }
}
