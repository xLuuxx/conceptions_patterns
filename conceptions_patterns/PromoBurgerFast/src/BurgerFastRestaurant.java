import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private List<Observer> clientsVIP;
    private String nomRestaurant;

    public BurgerFastRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
        this.clientsVIP = new ArrayList<>();
    }

    public void ajouterClientVIP(Observer client) {
        clientsVIP.add(client);
    }

    public void creerPromotionFlash(Promotion promotion) {
        System.out.println("Création d'une nouvelle promotion flash: " + promotion.toString());
        notifierClientsVIP(promotion);
    }

    private void notifierClientsVIP(Promotion promotion) {
        for (Observer client : clientsVIP) {
            client.update(promotion);
        }
    }

    public void supprimerClientVIP(Observer client) {
        clientsVIP.remove(client);
        System.out.println("Client VIP retiré de " + nomRestaurant);
    }
}
