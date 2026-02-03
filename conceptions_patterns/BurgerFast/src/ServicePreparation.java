public class ServicePreparation {
    public boolean verifierTempsPreparation(int nbBurgers) {
        System.out.println("  Vérification temps de préparation");
        int tempsEstime = nbBurgers * 5;
        if (tempsEstime > 30) {
            System.out.println("Temps insuffisant: " + tempsEstime + " min");
            return false;
        }
        System.out.println("Temps OK: " + tempsEstime + " min");
        return true;
    }
}
