public interface StrategieLivraison {
    double calculerFraisLivraison(double prixCommande, double distance);
    String getDescription();
}
