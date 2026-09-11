public class DonerDirector {

    public Doner constructClassicDoner(Doner.Builder builder) {

        return builder.withWrap(Doner.WrapType.Lavash)
                .withMeat(Doner.MeatType.Beef)
                .withFries(true)
                .withGarlicSauce(true)
                .makeSpicy(false)
                .build();
    }

    public Doner constructStudentSpecial(Doner.Builder builder) {
        return builder.withWrap(Doner.WrapType.CheeseLavash)
                .withMeat(Doner.MeatType.Chicken)
                .withFries(true)
                .withGarlicSauce(true)
                .makeSpicy(true)
                .build();
    }
}
