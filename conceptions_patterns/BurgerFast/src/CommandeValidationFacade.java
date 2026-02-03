public class CommandeValidationFacade {
    private ServiceConnexion serviceConnexion;
    private ServiceStock serviceStock;
    private ServicePreparation servicePreparation;
    private ServiceLivraison serviceLivraison;
    private ServiceZone serviceZone;

    public CommandeValidationFacade() {
        this.serviceConnexion = new ServiceConnexion();
        this.serviceStock = new ServiceStock();
        this.servicePreparation = new ServicePreparation();
        this.serviceLivraison = new ServiceLivraison();
        this.serviceZone = new ServiceZone();
    }

    public boolean validerCommande(String userId, String[] ingredients, int nbBurgers, String codePostal) {
        System.out.println("\nValidation de la commande");

        if (!serviceConnexion.checkUser(userId)) {
            System.out.println("\nCommande refusée: utilisateur non connecté\n");
            return false;
        }

        if (!serviceStock.checkAvailaible(ingredients)) {
            System.out.println("\nCommande refusée: ingrédients manquants\n");
            return false;
        }

        if (!servicePreparation.verifierTempsPreparation(nbBurgers)) {
            System.out.println("\nCommande refusée: temps insuffisant\n");
            return false;
        }

        if (!serviceLivraison.verifierDisponibiliteLivreur()) {
            System.out.println("\nCommande refusée: aucun livreur disponible\n");
            return false;
        }

        if (!serviceZone.verifierZoneLivraison(codePostal)) {
            System.out.println("\nCommande refusée: hors zone de livraison\n");
            return false;
        }

        System.out.println("\nCommande validée et acceptée !\n");
        return true;
    }
}
