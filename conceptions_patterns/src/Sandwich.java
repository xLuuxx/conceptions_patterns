public class Sandwich {
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String veggies;
    private final String sauce;
    private final boolean grilled;

    Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.veggies = builder.veggies;
        this.sauce = builder.sauce;
        this.grilled = builder.grilled;
    }

    @Override
    public String toString() {
        return " Your Sandwich contains -> " + bread + ','+ meat + ',' + cheese + ',' + veggies + ',' + sauce + ',' + (grilled ? "grillé" : "pas grillé") + '.';
    }
}
