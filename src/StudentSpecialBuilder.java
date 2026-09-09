class StudentSpecialBuilder extends DonerBuilder {
    @Override
    public StudentSpecialBuilder buildWrap() {
        this.wrap = WrapType.CheeseLavash;
        return this;
    }

    @Override
    public StudentSpecialBuilder buildMeat() {
        this.meat = MeatType.Chicken;
        return this;
    }

    @Override
    public StudentSpecialBuilder buildToppings() {
        this.hasTomato = false;
        this.hasPickles = false;
        this.hasFries = true;
        this.hasGarlicSauce = true;
        this.isSpicy = true;
        return this;
    }
}
