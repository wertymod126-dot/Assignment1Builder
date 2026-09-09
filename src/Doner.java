

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

    //constructor

    protected Doner(DonerBuilder builder) {
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
        return String.format("Doner----------------- \n-----Wrap=%s,\n -----Meat=%s,\n -----Tomato=%b,\n -----Pickles=%b,\n -----Onion=%b,\n -----FriesInside=%b,\n -----GarlicSauce=%b,\n -----Spicy=%b\n",
                wrap, meat, hasTomato, hasPickles, hasOnion, hasFries, hasGarlicSauce, isSpicy);
    }
}

