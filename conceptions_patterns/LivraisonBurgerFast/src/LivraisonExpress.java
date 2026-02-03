public class LivraisonExpress implements StrategieLivraison {

    @Override
    public double calculerFraisLivraison(double prixCommande, double distance) {
        double frais = 5.0 + (distance * 5.0);

        if (prixCommande >= 50.0) {
            frais -= 2.0;
        }
        return frais;
    }

    @Override
    public String getDescription() {
        return "Livraison Express - 5 euros + 5 euro / km MAIS 2 euros de réduction à partir de 50 euros d'achat.";
    }
}
