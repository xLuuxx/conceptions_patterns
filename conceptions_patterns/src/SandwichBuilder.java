public class SandwichBuilder {
    final String bread;
    String meat;
    String cheese;
    String veggies;
    String sauce;
    boolean grilled;

    public SandwichBuilder(String bread) {
        this.bread = bread;
    }

    public SandwichBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }

    public SandwichBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder veggies(String veggies) {
        this.veggies = veggies;
        return this;
    }

    public SandwichBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder grilled(boolean grilled) {
        this.grilled = grilled;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}
