public class Main {
    public static void main(String[] args) {
        Commande commande1 = new Commande(25.0, 3.0);
        commande1.setStrategieLivraison(new LivraisonStandard());
        commande1.afficherDetails();

        Commande commande2 = new Commande(35.0, 5.0);
        commande2.setStrategieLivraison(new LivraisonStandard());
        commande2.afficherDetails();

        Commande commande3 = new Commande(40.0, 7.0);
        commande3.setStrategieLivraison(new LivraisonExpress());
        commande3.afficherDetails();

        Commande commande4 = new Commande(55.0, 10.0);
        commande4.setStrategieLivraison(new LivraisonExpress());
        commande4.afficherDetails();

        Commande commande5 = new Commande(20.0, 0.0);
        commande5.setStrategieLivraison(new ClickAndCollect());
        commande5.afficherDetails();
    }
}