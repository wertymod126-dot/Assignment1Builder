public class Doner {

    public enum WrapType { Lavash, CheeseLavash, FriedLavash }
    public enum MeatType { Beef, Chicken, MixedMeat }

    private final WrapType wrap;
    private final MeatType meat;
    private final boolean hasTomato;
    private final boolean hasPickles;
    private final boolean hasOnion;
    private final boolean hasFries;
    private final boolean hasGarlicSauce;
    private final boolean isSpicy;


    private Doner(Builder builder) {
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
        return String.format("Doner----------------- \n-----Wrap = %s,\n -----Meat = %s,\n -----Tomato = %b,\n -----Pickles = %b,\n -----Onion = %b,\n -----FriesInside = %b,\n -----GarlicSauce = %b,\n -----Spicy = %b\n",
                wrap, meat, hasTomato, hasPickles, hasOnion, hasFries, hasGarlicSauce, isSpicy);
    }


    public static class Builder {


        private WrapType wrap;
        private MeatType meat;
        private boolean hasTomato = true;
        private boolean hasPickles = true;
        private boolean hasOnion = false;
        private boolean hasFries = true;
        private boolean hasGarlicSauce = false;
        private boolean isSpicy = false;

        public Builder withWrap(WrapType wrap) { this.wrap = wrap; return this; }
        public Builder withMeat(MeatType meat) { this.meat = meat; return this; }
        public Builder withFries(boolean hasFries) { this.hasFries = hasFries; return this; }
        public Builder withGarlicSauce(boolean hasGarlicSauce) { this.hasGarlicSauce = hasGarlicSauce; return this; }
        public Builder withPickles(boolean hasPickles) { this.hasPickles = hasPickles; return this; }
        public Builder withOnion(boolean isOnion) { this.hasOnion = isOnion; return this; }
        public Builder withTomato(boolean hasTomato) { this.hasTomato = hasTomato; return this; }
        public Builder makeSpicy(boolean isSpicy) { this.isSpicy = isSpicy; return this; }



        public Doner build() {
            validateOrder();
            return new Doner(this);
        }

        private void validateOrder() {
            if (wrap == null) throw new IllegalStateException("Missing wrap.");
            if (meat == null) throw new IllegalStateException("Missing meat.");
        }
    }
}