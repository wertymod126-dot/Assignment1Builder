public class DonerBuilder {
    protected WrapType wrap;
    protected MeatType meat;
    protected boolean hasTomato = true;
    protected boolean hasPickles = true;
    protected boolean hasOnion = false;
    protected boolean hasFries = true;
    protected boolean hasGarlicSauce = false;
    protected boolean isSpicy = false;

    public DonerBuilder withWrap(WrapType wrap) {
        this.wrap = wrap;
        return this;
    }

    public DonerBuilder withMeat(MeatType meat) {
        this.meat = meat;
        return this;
    }

    public DonerBuilder withFries(boolean hasFries) {
        this.hasFries = hasFries;
        return this;
    }

    public DonerBuilder withGarlicSauce(boolean hasGarlicSauce) {
        this.hasGarlicSauce = hasGarlicSauce;
        return this;
    }

    public DonerBuilder withPickles(boolean hasPickles) {
        this.hasPickles = hasPickles;
        return this;
    }

    public DonerBuilder withOnion(boolean isOnion) {
        this.hasOnion = isOnion;
        return this;
    }

    public DonerBuilder withTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
        return this;
    }

    public DonerBuilder makeSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
        return this;
    }

    public Doner build() {
        validateOrder();
        return new Doner(this);
    }

    public DonerBuilder asClassic() {
        this.wrap = WrapType.Lavash;
        this.meat = MeatType.Beef;
        this.hasGarlicSauce = true;
        return this;
    }

    public DonerBuilder asStudentSpecial() {
        this.wrap = WrapType.CheeseLavash;
        this.meat = MeatType.Chicken;
        this.hasTomato = false;
        this.hasPickles = false;
        this.hasFries = true;
        this.hasGarlicSauce = true;
        this.isSpicy = true;
        return this;
    }

    private void validateOrder() {
        if (wrap == null) {
            throw new IllegalStateException("A doner must have a valid wrap, like Lavash.");
        }
        if (meat == null) {
            throw new IllegalStateException("A doner must have valid meat, like Beef.");
        }
    }
}