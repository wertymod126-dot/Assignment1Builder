enum WrapType {
    Lavash,
    CheeseLavash,
    FriedLavash,
}

enum MeatType {
    Beef,
    Chicken,
    MixedMeat,
}

public class Doner {


    private final WrapType wrap;
    private final MeatType meat;
    private final boolean hasTomato;
    private final boolean hasPickles;
    private final boolean hasOnion;
    private final boolean hasFries;
    private final boolean hasGarlicSauce;
    private final boolean isSpicy;

    Doner(DonerBuilder builder) {
        this.wrap = builder.wrap;
        this.meat = builder.meat;
        this.hasTomato = builder.hasTomato;
        this.hasOnion = builder.hasOnion;
        this.hasPickles = builder.hasPickles;
        this.hasFries = builder.hasFries;
        this.hasGarlicSauce = builder.hasGarlicSauce;
        this.isSpicy = builder.isSpicy;
    }

    @Override
    public String toString() {

        return String.format("Doner [Wrap=%s, Meat=%s, Tomato=%b, Pickles=%b, Onion=%b, FriesInside=%b, GarlicSauce=%b, Spicy=%b]",

                wrap, meat, hasTomato,hasPickles, hasOnion, hasFries, hasGarlicSauce, isSpicy);

    }
}

