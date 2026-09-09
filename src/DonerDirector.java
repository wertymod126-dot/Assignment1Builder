public class DonerDirector {
    private DonerBuilder builder;

    public void setBuilder(DonerBuilder builder) {
        this.builder = builder;
    }

    public Doner constructDoner() {
        validateBuilder();
        builder.buildWrap();
        builder.buildMeat();
        builder.buildToppings();
        return builder.build();


    }

    private void validateBuilder() {
        if (this.builder == null) {
            throw new IllegalStateException("builder is null");
        }
    }
}
