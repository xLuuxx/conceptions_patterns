import java.util.Arrays;
import java.util.List;

public class ServiceLivraison {
    private List<String> livreurs;

    public ServiceLivraison() {
        livreurs = Arrays.asList("Livreur1", "Livreur2", "Livreur3");
    }

    public boolean verifierDisponibiliteLivreur() {
        System.out.println("Vérification disponibilité livreur");
        boolean disponible = !livreurs.isEmpty();
        if (disponible) {
            System.out.println("Livreur disponible: " + livreurs.get(0));
        } else {
            System.out.println("Aucun livreur disponible");
        }
        return disponible;
    }
}
