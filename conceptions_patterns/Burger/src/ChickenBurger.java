public class ChickenBurger implements Burger {
    @Override
    public String getDescription() {
        return "Chicken Burger : brioche bread, grilled chicken, lettuce, mayo";
    }

    @Override
    public double getPrice() {
        return 9.00;
    }
}
