public class BurgerFactory {

    public static Burger createBurger(String type) {
        switch (type.toLowerCase()) {
            case "veggie":
                return new BurgerVeggie();
            case "cheese":
                return new CheeseBurger();
            case "chicken":
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Type de burger inconnu.");
        }
    }
}
