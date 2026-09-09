public class DonerDirector {
    private DonerBuilder builder;

    public void setBuilder(DonerBuilder builder) {
        this.builder = builder;
    }

    public Doner constructDoner() {
        if (this.builder == null) {
            throw new IllegalStateException("builder is null");
        }
        builder.buildWrap();
        builder.buildMeat();
        builder.buildToppings();
        return builder.build();


    }
}
