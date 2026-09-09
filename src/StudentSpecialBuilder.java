class StudentSpecialBuilder extends DonerBuilder {
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
        this.hasTomato = false;
        this.hasPickles = false;
        this.hasFries = true;
        this.hasGarlicSauce = true;
        this.isSpicy = true;
    }
}
