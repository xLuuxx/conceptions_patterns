public class ClickAndCollect implements StrategieLivraison {

    @Override
    public double calculerFraisLivraison(double prixCommande, double distance) {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return "Click and Collect: Récupérez votre commande en magasin sans frais de livraison.";
    }
}
