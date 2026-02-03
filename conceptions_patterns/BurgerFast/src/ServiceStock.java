import java.util.HashMap;
import java.util.Map;

public class ServiceStock {
    private Map<String, Integer> stock;

    public ServiceStock() {
        stock = new HashMap<>();
        stock.put("pain", 50);
        stock.put("viande", 30);
        stock.put("salade", 20);
        stock.put("fromage", 25);
    }

    public boolean checkAvailaible(String[] ingredients) {
        System.out.println("  Vérification disponibilité des ingrédients");
        for (String ingredient : ingredients) {
            if (!stock.containsKey(ingredient) || stock.get(ingredient) <= 0) {
                System.out.println("    Ingrédient manquant: " + ingredient);
                return false;
            }
        }
        System.out.println("Tous les ingrédients disponibles");
        return true;
    }
}
