public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant("BurgerFast Toulouse");

        ClientVIP client1 = new ClientVIP("Alice", "alice@email.com");
        ClientVIP client2 = new ClientVIP("Bob", "bob@gmail.com");
        ClientVIP client3 = new ClientVIP("Charlie", "charlie@email.com");

        restaurant.ajouterClientVIP(client1);
        restaurant.ajouterClientVIP(client2);
        restaurant.ajouterClientVIP(client3);

        Promotion promo1 = new Promotion(
                "Menu Étudiant Flash",
                "Burger + Frites + Boisson",
                10
        );
        restaurant.creerPromotionFlash(promo1);

        System.out.println("Désabonnement de Bob");
        restaurant.supprimerClientVIP(client2);

        Promotion promo2 = new Promotion(
                "Menu Famille Flash",
                "2 Burgers + 2 Frites + 2 Boissons",
                5
        );
        restaurant.creerPromotionFlash(promo2);

        System.out.println("Nouveau client VIP");
        ClientVIP client4 = new ClientVIP("Diana", "diana@email.com");
        restaurant.ajouterClientVIP(client4);

        Promotion promo3 = new Promotion(
                "Menu Veggie Flash",
                "Burger Veggie + Frites + Boisson",
                10
        );
        restaurant.creerPromotionFlash(promo3);
    }
}
