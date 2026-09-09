class ClassicDonerBuilder extends DonerBuilder {
    @Override
    public void buildWrap() {
        this.wrap = WrapType.Lavash;
    }

    @Override
    public void buildMeat() {
        this.meat = MeatType.Chicken;
    }

    @Override
    public void buildToppings() {
        this.hasGarlicSauce = true;
    }
}
