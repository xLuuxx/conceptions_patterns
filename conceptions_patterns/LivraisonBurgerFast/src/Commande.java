public class Commande {
    private double prixCommande;
    private double distance;
    private StrategieLivraison strategieLivraison;

    public Commande(double prixCommande, double distance) {
        this.prixCommande = prixCommande;
        this.distance = distance;
    }

    public void setStrategieLivraison(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerFrais() {
        if (strategieLivraison == null) {
            throw new IllegalStateException("La stratégie de livraison n'a pas été définie.");
        }
        return strategieLivraison.calculerFraisLivraison(prixCommande, distance);
    }

    public void afficherDetails() {
        System.out.println("Prix de la commande est de : " + prixCommande + " euros.");
        System.out.println("Distance de livraison est de : " + distance + " km.");
        System.out.println("Stratégie de livraison : " + strategieLivraison.getDescription());
        double frais = calculerFrais();
        System.out.println("Frais de livraison calculés : " + frais + " euros.");
        System.out.println("Total à payer : " + (prixCommande + frais) + " euros.");
    }
}
