import java.util.Arrays;
import java.util.List;

public class ServiceZone {
    private List<String> zonesLivraison;

    public ServiceZone() {
        zonesLivraison = Arrays.asList("75001", "75002", "75003", "75004", "75005");
    }

    public boolean verifierZoneLivraison(String codePostal) {
        System.out.println("  Vérification zone de livraison: " + codePostal);
        boolean dansZone = zonesLivraison.contains(codePostal);
        if (dansZone) {
            System.out.println("Zone de livraison valide");
        } else {
            System.out.println("Hors zone de livraison");
        }
        return dansZone;
    }
}
