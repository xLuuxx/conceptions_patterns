public class Main {
    public static void main(String[] args) {
        Burger burger1 = BurgerFactory.createBurger("veggie");
        System.out.println(burger1.getDescription());
        System.out.println("Prix : " + burger1.getPrice() + "€\n");

        Burger burger2 = BurgerFactory.createBurger("cheese");
        System.out.println(burger2.getDescription());
        System.out.println("Prix : " + burger2.getPrice() + "€\n");

        Burger burger3 = BurgerFactory.createBurger("chicken");
        System.out.println(burger3.getDescription());
        System.out.println("Prix : " + burger3.getPrice() + "€\n");
    }
}