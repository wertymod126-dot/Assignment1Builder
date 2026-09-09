class ClassicDonerBuilder extends DonerBuilder {
    @Override
    public ClassicDonerBuilder buildWrap() {
        this.wrap = WrapType.Lavash;
        return this;
    }

    @Override
    public ClassicDonerBuilder buildMeat() {
        this.meat = MeatType.Beef;
        return this;
    }

    @Override
    public ClassicDonerBuilder buildToppings() {
        this.hasGarlicSauce = true;
        return this;
    }
}
