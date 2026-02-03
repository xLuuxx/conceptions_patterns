import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(String nomFichier) {
        this.lecteur = new LecteurCSV(nomFichier);
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColumns(i);
            total += calculerMontant(colonnes[2]);
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColumns(i);
            String produit = colonnes[1].trim();
            double montant = calculerMontant(colonnes[2]);

            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + montant);
        }

        return caParProduit;
    }

    private double calculerMontant(String prixQuantite) {
        String[] parts = prixQuantite.trim().split("x");
        double prix = Double.parseDouble(parts[0]);
        int quantite = Integer.parseInt(parts[1]);
        return prix * quantite;
    }
}
