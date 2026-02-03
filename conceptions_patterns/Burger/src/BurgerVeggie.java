public class BurgerVeggie implements Burger {
    @Override
    public String getDescription() {
        return "Burger Veggie : complet bread, salad, tomato, carrot";
    }

    @Override
    public double getPrice() {
        return 8.00;
    }
}
