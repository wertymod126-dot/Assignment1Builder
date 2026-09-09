abstract  class DonerBuilder {
    protected WrapType wrap;
    protected MeatType meat;
    protected boolean hasTomato = true;
    protected boolean hasPickles = true;
    protected boolean hasOnion = false;
    protected boolean hasFries = true;
    protected boolean hasGarlicSauce = false;
    protected boolean isSpicy = false;

    public abstract void buildWrap();
    public abstract void buildMeat();
    public abstract void buildToppings();

    public Doner build() {
        validateOrder();
        return new Doner(this);
    }

    private void validateOrder() {
        if (wrap == null) {
            throw new IllegalStateException("A doner must have valid wrap , like Lavash");
        }
        if (meat == null) {
            throw new IllegalStateException("A doner must have valid meat , like beef");
        }
    }


}

