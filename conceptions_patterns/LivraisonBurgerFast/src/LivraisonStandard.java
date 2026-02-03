public class LivraisonStandard implements StrategieLivraison {

    @Override
    public double calculerFraisLivraison(double prixCommande, double distance) {
        double frais = 2.0 + (distance * 0.50);

        if (prixCommande >= 30.0) {
            return 0.0;
        }
        return frais;
    }

    @Override
    public String getDescription() {
        return "Livraison Standard : 2 euros + 0.50euros / km MAIS GRATUITE à partir de 30 euros d'achat.";

    }
}
