public class DonerDirector {

    public Doner constructClassicDoner(DonerBuilder donerBuilder) {
        return donerBuilder.withWrap(WrapType.Lavash)
                .withMeat(MeatType.Beef)
                .withFries(true)
                .withGarlicSauce(true)
                .makeSpicy(false)
                .build();
    }

    public Doner constructStudentSpecial(DonerBuilder builder) {
        return builder.withWrap(WrapType.CheeseLavash)
                .withMeat(MeatType.Chicken)
                .withFries(true)
                .withGarlicSauce(true)
                .makeSpicy(true)
                .build();
    }

}